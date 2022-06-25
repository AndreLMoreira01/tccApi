package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Jogo;
import br.com.andre.tcc.repository.JogoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

private JogoRepository jogoRepository;

public List<Jogo> listarTodosJogos() { return  jogoRepository.findAll(); }


}
