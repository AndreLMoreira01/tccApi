package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Conquista;
import br.com.andre.tcc.repository.ConquistaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConquistaService {

    @Autowired
public ConquistaRepository conquistaRepository;

public List<Conquista> listarTodasConquistar(){
    return conquistaRepository.findAll();
}

    public Conquista salvar(Conquista  conquista){
        return conquistaRepository.save(conquista);
    }

    public Conquista atualizar(Long id, Conquista conquista) {
        Conquista conquistaSalvo = buscarConquistaExistente(id);

        BeanUtils.copyProperties(conquista, conquistaSalvo, "id");

        return conquistaRepository.save(conquistaSalvo);
    }
    
    private Conquista buscarConquistaExistente(Long id) {
        Optional<Conquista> conquistaSalvo = conquistaRepository.findById(id);
        if (!conquistaSalvo.isPresent()){
            throw new IllegalArgumentException();
        }

        return conquistaSalvo.get();
    }


}
