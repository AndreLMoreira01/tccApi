package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Conquista;
import br.com.andre.tcc.model.Historia;
import br.com.andre.tcc.repository.ConquistaRepository;
import br.com.andre.tcc.service.ConquistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/conquistas")
public class ConquistResource {

    @Autowired
    private ConquistaRepository conquistaRepository;

    @Autowired
    private ConquistaService conquistaService;

    @GetMapping("/todos")
    public List<Conquista> listarTodasConquistar() { return conquistaService.listarTodasConquistar(); }
}
