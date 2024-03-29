package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Alternativa;
import br.com.andre.tcc.repository.AlternativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlternativaService {

    @Autowired
    private AlternativaRepository alternativaRepository;

    public List<Alternativa> listarTodasAlternativas() { return  alternativaRepository.findAll();}

    public Alternativa salvar(Alternativa alternativa) {
        return alternativaRepository.save(alternativa);
    }

}
