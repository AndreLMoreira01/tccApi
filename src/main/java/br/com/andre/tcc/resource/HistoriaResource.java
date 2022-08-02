package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Historia;
import br.com.andre.tcc.repository.HistoriaRepository;
import br.com.andre.tcc.service.HistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/historias")
public class HistoriaResource {

    @Autowired
    private HistoriaService historiaService;

    @Autowired
    private HistoriaRepository historiaRepository;

    @GetMapping("/todos")
    public List<Historia> listarTodasHistorias() { return historiaService.listarTodoasHistorias(); }
}
