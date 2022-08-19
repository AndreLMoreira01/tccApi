package br.com.andre.tcc.service;


import br.com.andre.tcc.model.Login;
import br.com.andre.tcc.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public List<Login> listarTodosLogin(){return loginRepository.findAll();}

    public Login salvar(Login login) {return loginRepository.save(login);}
}
