package com.example.demo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Answer")
class Answer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String AnswerText;

    @Column(nullable = false)
    private Long QuestionId;

    public void setAnswerText(String AnswerText) {
        this.AnswerText =AnswerText;
    }

    public String getAnswerText() {
        return AnswerText;
    }

    public void setQuestionId(String QuestionId) {
        this.QuestionId = Long.valueOf(QuestionId);
    }

    public Long QuestionId() {
        return QuestionId;
    }

    public void AnswerText(String s) {
    }

    public String getId() {
        return null;
    }


    // Getters and setters

}