package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Jogo;
import br.com.andre.tcc.repository.JogoRepository;
import br.com.andre.tcc.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogoResource {

    @Autowired
    private JogoService jogoService;

    @Autowired
    private JogoRepository jogoRepository;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Jogo> listarTodosJogos() { return jogoService.listarTodosJogos(); }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Jogo> criar(@RequestBody Jogo jogo) {
        Jogo jogoSalvo = jogoService.salvar(jogo);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogoSalvo);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Jogo> buscarPeloId(@PathVariable Long id){
        Optional<Jogo> jogo = jogoRepository.findById(id);
        return jogo.isPresent() ? ResponseEntity.ok(jogo.get()) : ResponseEntity.notFound().build();
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        jogoRepository.deleteById(id);
    }

}
