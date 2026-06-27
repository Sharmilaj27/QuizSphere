package com.sharmila.quizsphere.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuizSubmissionRequest {

    private Long userId;

    private Long quizId;

    private List<AnswerRequest> answers;
}