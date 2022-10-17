package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Pergunta;
import br.com.andre.tcc.repository.PerguntaRepository;
import br.com.andre.tcc.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/perguntas")
public class PerguntaResource {

    @Autowired
    private PerguntaService perguntaService;

    @Autowired
    private PerguntaRepository perguntaRepository;
    @CrossOrigin
    @GetMapping("/todos")
    public List<Pergunta> listarTodasPerguntas() { return perguntaService.listarTodasPerguntas(); }
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Pergunta> criar(@RequestBody Pergunta pergunta) {
        Pergunta perguntaSalvo = perguntaService.salvar(pergunta);
        return ResponseEntity.status(HttpStatus.CREATED).body(perguntaSalvo);
    }
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Pergunta> buscarPeloId(@PathVariable Long id){
        Optional<Pergunta> pergunta = perguntaRepository.findById(id);
        return pergunta.isPresent() ? ResponseEntity.ok(pergunta.get()) : ResponseEntity.notFound().build();
    }
    @CrossOrigin
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        perguntaRepository.deleteById(id);
    }

}
