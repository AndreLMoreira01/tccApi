package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Historia;
import br.com.andre.tcc.repository.HistoriaRepository;
import br.com.andre.tcc.service.HistoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historias")
public class HistoriaResource {

    @Autowired
    private HistoriaService historiaService;

    @Autowired
    private HistoriaRepository historiaRepository;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Historia> listarTodasHistorias() { return historiaService.listarTodoasHistorias(); }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Historia> criar(@RequestBody Historia historia) {
        Historia historiaSalvo = historiaService.salvar(historia);
        return ResponseEntity.status(HttpStatus.CREATED).body(historiaSalvo);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Historia> buscarPeloId(@PathVariable Long id){
        Optional<Historia> historia = historiaRepository.findById(id);
        return historia.isPresent() ? ResponseEntity.ok(historia.get()) : ResponseEntity.notFound().build();
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        historiaRepository.deleteById(id);
    }

}
