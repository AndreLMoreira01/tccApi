package br.com.andre.tcc.resource;


import br.com.andre.tcc.model.Quiz;
import br.com.andre.tcc.service.HistoriaService;
import br.com.andre.tcc.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizResource {

    @Autowired
    private QuizService quizService;

    @Autowired
    private HistoriaService historiaService;


}
