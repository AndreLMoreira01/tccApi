package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Historia;
import br.com.andre.tcc.repository.HistoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaService {
    @Autowired
    private HistoriaRepository historiaRepository;

    public List<Historia> listarTodoasHistorias(){
        return historiaRepository.findAll();
    }

    public Historia salvar(Historia historia) {
        return historiaRepository.save(historia);
    }
}
