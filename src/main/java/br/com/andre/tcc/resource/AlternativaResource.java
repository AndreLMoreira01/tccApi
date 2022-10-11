package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Alternativa;
import br.com.andre.tcc.repository.AlternativaRepository;
import br.com.andre.tcc.service.AlternativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alternativas")
public class AlternativaResource {

    @Autowired
    private AlternativaService alternativaService;

    @Autowired
    private AlternativaRepository alternativaRepository;

    @GetMapping("/todos")
    public List<Alternativa> listarTodasAlternativas() { return alternativaService.listarTodasAlternativas(); }



}
