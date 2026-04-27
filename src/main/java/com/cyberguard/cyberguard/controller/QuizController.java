package com.cyberguard.cyberguard.controller;

import com.cyberguard.cyberguard.entity.RespostaQuiz;
import com.cyberguard.cyberguard.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping
    public List<?> listarPerguntas() {
        return service.getPerguntas();
    }

    @PostMapping("/responder")
    public String responder(@RequestBody RespostaQuiz resposta) {
        int pontos = service.corrigir(resposta.getRespostas());
        return "Pontuação: " + pontos;
    }
}