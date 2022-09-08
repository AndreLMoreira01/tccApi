package br.com.andre.tcc.service;

import br.com.andre.tcc.model.Quiz;
import br.com.andre.tcc.resource.QuizResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizResource quizResource;

    @Autowired
    private  QuizService quizService;



}
