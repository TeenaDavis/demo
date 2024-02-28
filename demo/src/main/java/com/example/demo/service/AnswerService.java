package com.example.demo.service;

import com.example.demo.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    // Implement methods to interact with Answer repository
}