package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Pergunta;
import br.com.andre.tcc.repository.PerguntaRepository;
import br.com.andre.tcc.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaResource {

    @Autowired
    private PerguntaService perguntaService;

    @Autowired
    private PerguntaRepository perguntaRepository;

    @GetMapping("/todos")
    public List<Pergunta> listarTodasPerguntas() { return perguntaService.listarTodasPerguntas(); }



}
