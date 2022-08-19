package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Cadastro;
import br.com.andre.tcc.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;
}
