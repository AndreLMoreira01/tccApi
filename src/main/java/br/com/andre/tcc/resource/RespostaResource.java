package br.com.andre.tcc.resource;


import br.com.andre.tcc.model.Resposta;
import br.com.andre.tcc.repository.RespostaRepository;
import br.com.andre.tcc.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaResource {

    @Autowired
    private RespostaService respostaService;

    @Autowired
    private RespostaRepository respostaRepository;

    @GetMapping("/todos")
    public List<Resposta> listarTodasRespostas() { return respostaService.listarTodasRespostas(); }


}
