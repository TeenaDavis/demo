package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

import java.security.cert.CertPathBuilder;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
