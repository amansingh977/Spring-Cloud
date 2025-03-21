package com.springcloud.quizservice.model;

import lombok.*;

@Data
public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;
}
