package com.example.demo.controller;

import com.example.demo.data.Answer;
import com.example.demo.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping
public class AnswerController{
    @Autowired
    private AnswerRepository answerRepository;

    public AnswerController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @PostMapping("/data/answer")
    public void createAnswers(@RequestBody List<Answer> answers) {
        answerRepository.saveAll(answers);
    }
}