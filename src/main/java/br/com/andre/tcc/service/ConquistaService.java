package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Conquista;
import br.com.andre.tcc.repository.ConquistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConquistaService {

    @Autowired
public ConquistaRepository conquistaRepository;

public List<Conquista> listarTodasConquistar(){
    return conquistaRepository.findAll();
}



}
