package br.com.andre.tcc.resource;


import br.com.andre.tcc.model.Jogo;
import br.com.andre.tcc.repository.JogoRepository;
import br.com.andre.tcc.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogoResource {

    @Autowired
    private JogoService jogoService;

    @Autowired
    private JogoRepository jogoRepository;

    @GetMapping("/todos")
    public List<Jogo> listarTodosJogos() {return  jogoService.listarTodosJogos();}

    //


}
