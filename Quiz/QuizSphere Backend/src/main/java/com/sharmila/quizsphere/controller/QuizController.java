package com.sharmila.quizsphere.controller;

import com.sharmila.quizsphere.dto.QuestionResponse;
import com.sharmila.quizsphere.dto.QuizSubmissionRequest;
import com.sharmila.quizsphere.dto.ResultResponse;
import com.sharmila.quizsphere.entity.Quiz;
import com.sharmila.quizsphere.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
@RequiredArgsConstructor
@CrossOrigin("*")
public class QuizController {

    private final QuizService quizService;

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @GetMapping("/{quizId}/questions")
    public List<QuestionResponse> getQuestions(
            @PathVariable Long quizId) {

        return quizService.getQuestionsByQuiz(quizId);
    }

    @PostMapping("/submit")
    public ResultResponse submitQuiz(
            @RequestBody QuizSubmissionRequest request) {

        return quizService.submitQuiz(request);
    }
}