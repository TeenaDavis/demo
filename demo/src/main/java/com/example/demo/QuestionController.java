package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/data/questions")
public class QuestionController<type> {

    @Autowired
    private QuestionRepository questionRepository;
    private Type type;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
    @GetMapping("/questions/{type}")
    public List<Question> getQuestionsByType(@PathVariable String type) {
        return questionRepository.findByType(Question.Type.valueOf(type));
}

}


