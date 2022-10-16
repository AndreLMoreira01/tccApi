package br.com.andre.tcc.service;


import br.com.andre.tcc.model.Pergunta;
import br.com.andre.tcc.model.Resposta;
import br.com.andre.tcc.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespostaService {

    @Autowired
    private RespostaRepository respostaRepository;

    public List<Resposta> listarTodasRespostas(){
        return respostaRepository.findAll();
    }


}
