package br.com.andre.tcc.resource;

import br.com.andre.tcc.model.Login;
import br.com.andre.tcc.repository.LoginRepository;
import br.com.andre.tcc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginResource {

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/todos")
    public List<Login> listarTodosLogin() { return loginService.listarTodosLogin(); }

    @PostMapping
    public ResponseEntity<Login> criar(@RequestBody Login login) {
        Login loginSalvo = loginService.salvar(login);
        return ResponseEntity.status(HttpStatus.CREATED).body(loginSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Login> buscarPeloId(@PathVariable Long id){
        Optional<Login> login = loginRepository.findById(id);
        return login.isPresent() ? ResponseEntity.ok(login.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        loginRepository.deleteById(id);
    }
}
