package com.example.demo.controller;

import com.example.demo.data.Question;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data/questions")
public class QuestionController<type> {

    @Autowired
    private QuestionRepository questionRepository;
    private Question.Type type;
    private QuestionController<Object> questionService;


    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
    @GetMapping("/questions/{type}")
    public List<Question> getQuestionsByType(@PathVariable String type) {
        return questionRepository.findByType(Question.Type.valueOf(type));
}

}


