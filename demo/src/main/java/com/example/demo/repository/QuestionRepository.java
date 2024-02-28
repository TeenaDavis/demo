package com.example.demo.repository;
import com.example.demo.data.Question;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByType(Question.Type type);
}
