package com.sharmila.quizsphere.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultDto {

    private Long id;

    private Long userId;
    private String userName;

    private Long quizId;
    private String quizTitle;
    private String category;

    private Integer score;
    private Integer totalQuestions;

    private LocalDateTime attemptedAt;
}