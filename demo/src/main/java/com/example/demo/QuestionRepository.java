package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;


import java.lang.reflect.Type;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByType(Question.Type type);
}
