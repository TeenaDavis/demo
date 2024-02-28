package com.example.demo.data;


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
@Table(name = "Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String qText;
    @Enumerated(EnumType.STRING)
    private Type type;
    
    public Type getType() {
        return type;
    }

    public void setType(com.example.demo.model.Type type) {
    }


    public enum Type {
        INSURANCE,
        CASE
    }
    // Getters and setters

    public void setqText(String qText) {
        this.qText =qText;
    }

    public String getqText() {
        return qText;
    }

    public void qText(String s) {
    }


    // Getters and setters
}
