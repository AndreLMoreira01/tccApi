package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Conquista;
import br.com.andre.tcc.model.Historia;
import br.com.andre.tcc.repository.ConquistaRepository;
import br.com.andre.tcc.service.ConquistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conquistas")
public class ConquistaResource {

    @Autowired
    private ConquistaRepository conquistaRepository;

    @Autowired
    private ConquistaService conquistaService;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Conquista> listarTodasConquistar() { return conquistaService.listarTodasConquistar(); }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Conquista> buscarPeloId(@PathVariable Long id){
        Optional<Conquista> conquista = conquistaRepository.findById(id);
        return conquista.isPresent() ? ResponseEntity.ok(conquista.get()) : ResponseEntity.notFound().build();
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        conquistaRepository.deleteById(id);
    }

    @CrossOrigin
    @PostMapping()
    public ResponseEntity<Conquista> criar(@RequestBody Conquista conquista, HttpServletResponse response) {
        Conquista conquistaSalvo = conquistaService.salvar(conquista);
        return ResponseEntity.status(HttpStatus.CREATED).body(conquistaSalvo);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Conquista> atualizar(@PathVariable Long id, @RequestBody Conquista conquista){
        Conquista conquistaSalvo = conquistaService.atualizar(id, conquista);
        return ResponseEntity.ok(conquistaSalvo);
    }

}
