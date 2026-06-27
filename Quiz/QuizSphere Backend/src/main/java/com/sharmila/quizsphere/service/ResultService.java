package com.sharmila.quizsphere.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sharmila.quizsphere.dto.ResultDto;
import com.sharmila.quizsphere.entity.Quiz;
import com.sharmila.quizsphere.entity.Result;
import com.sharmila.quizsphere.entity.User;
import com.sharmila.quizsphere.repository.QuizRepository;
import com.sharmila.quizsphere.repository.ResultRepository;
import com.sharmila.quizsphere.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;
private final UserRepository userRepository;
private final QuizRepository quizRepository;

    public List<ResultDto> getUserResults(Long userId) {

    return resultRepository.findByUserId(userId)
            .stream()
            .map(result -> {

                User user = userRepository.findById(result.getUserId()).orElse(null);

                Quiz quiz = quizRepository.findById(result.getQuizId()).orElse(null);

                return ResultDto.builder()
                        .id(result.getId())
                        .userId(result.getUserId())
                        .userName(user != null ? user.getName() : "Unknown")

                        .quizId(result.getQuizId())
                        .quizTitle(quiz != null ? quiz.getTitle() : "Unknown Quiz")
                        .category(quiz != null ? quiz.getCategory() : "")

                        .score(result.getScore())
                        .totalQuestions(result.getTotalQuestions())
                        .attemptedAt(result.getAttemptedAt())
                        .build();
            })
            .toList();
}
    public List<ResultDto> getLeaderboard() {

    List<Result> results = resultRepository.findAll();

    results.sort((a, b) -> b.getScore().compareTo(a.getScore()));

    return results.stream()
            .map(result -> {

                User user = userRepository.findById(result.getUserId()).orElse(null);

                Quiz quiz = quizRepository.findById(result.getQuizId()).orElse(null);

                return ResultDto.builder()
                        .id(result.getId())
                        .userId(result.getUserId())
                        .userName(user != null ? user.getName() : "Unknown")

                        .quizId(result.getQuizId())
                        .quizTitle(quiz != null ? quiz.getTitle() : "Unknown Quiz")
                        .category(quiz != null ? quiz.getCategory() : "")

                        .score(result.getScore())
                        .totalQuestions(result.getTotalQuestions())
                        .attemptedAt(result.getAttemptedAt())
                        .build();
            })
            .toList();
}
    public Long totalAttempts() {
    return resultRepository.count();
}
}