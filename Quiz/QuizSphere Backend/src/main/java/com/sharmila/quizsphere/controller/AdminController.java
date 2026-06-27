package com.sharmila.quizsphere.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmila.quizsphere.entity.Question;
import com.sharmila.quizsphere.entity.Quiz;
import com.sharmila.quizsphere.repository.QuestionRepository;
import com.sharmila.quizsphere.repository.QuizRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AdminController {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;

    // CREATE QUIZ
    @PostMapping("/quiz")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizRepository.save(quiz);
    }

    // ADD QUESTIONS
    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return questionRepository.save(question);
    }

    // GET ALL QUIZZES
    @GetMapping("/quizzes")
    public List<Quiz> getQuizzes() {
        return quizRepository.findAll();
    }

    // DELETE QUIZ
    @DeleteMapping("/quiz/{id}")
    public String deleteQuiz(@PathVariable Long id) {
        quizRepository.deleteById(id);
        return "Quiz deleted";
    }
}