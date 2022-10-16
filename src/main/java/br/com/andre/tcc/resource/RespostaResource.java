package br.com.andre.tcc.resource;


import br.com.andre.tcc.model.Resposta;
import br.com.andre.tcc.repository.RespostaRepository;
import br.com.andre.tcc.service.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/respostas")
public class RespostaResource {

    @Autowired
    private RespostaService respostaService;

    @Autowired
    private RespostaRepository respostaRepository;

    @GetMapping("/todos")
    public List<Resposta> listarTodasRespostas() { return respostaService.listarTodasRespostas(); }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        respostaRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resposta> buscarPeloId(@PathVariable Long id){
        Optional<Resposta> resposta = respostaRepository.findById(id);
        return resposta.isPresent() ? ResponseEntity.ok(resposta.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Resposta> criar(@RequestBody Resposta resposta) {
        Resposta respostaSalvo = respostaService.salvar(resposta);
        return ResponseEntity.status(HttpStatus.CREATED).body(respostaSalvo);
    }

}
