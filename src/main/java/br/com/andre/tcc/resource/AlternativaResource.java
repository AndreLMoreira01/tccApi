package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Alternativa;
import br.com.andre.tcc.repository.AlternativaRepository;
import br.com.andre.tcc.service.AlternativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alternativas")
public class AlternativaResource {

    @Autowired
    private AlternativaService alternativaService;

    @Autowired
    private AlternativaRepository alternativaRepository;

    @GetMapping("/todos")
    public List<Alternativa> listarTodasAlternativas() { return alternativaService.listarTodasAlternativas(); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        alternativaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alternativa> buscarPeloId(@PathVariable Long id){
        Optional<Alternativa> alternativa = alternativaRepository.findById(id);
        return alternativa.isPresent() ? ResponseEntity.ok(alternativa.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Alternativa> criar(@RequestBody Alternativa alternativa) {
        Alternativa alternativaSalvo = alternativaService.salvar(alternativa);
        return ResponseEntity.status(HttpStatus.CREATED).body(alternativaSalvo);
    }



}
