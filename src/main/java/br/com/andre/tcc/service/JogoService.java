package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Jogo;
import br.com.andre.tcc.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> listarTodosJogos(){
        return jogoRepository.findAll();
    }

    public Jogo salvar(Jogo jogo) {
        return jogoRepository.save(jogo);
    }
}
