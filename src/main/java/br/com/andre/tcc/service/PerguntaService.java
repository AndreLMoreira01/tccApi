package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Pergunta;
import br.com.andre.tcc.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PerguntaService {

    @Autowired
    private PerguntaRepository perguntaRepository;

    public List<Pergunta> listarTodasPerguntas(){
        return perguntaRepository.findAll();
    }
}
