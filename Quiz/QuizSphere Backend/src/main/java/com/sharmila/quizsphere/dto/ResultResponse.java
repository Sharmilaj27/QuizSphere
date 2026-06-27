package com.sharmila.quizsphere.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultResponse {

    private Integer score;

    private Integer totalQuestions;

    private Double percentage;
}