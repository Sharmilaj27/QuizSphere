package com.sharmila.quizsphere.service;

import com.sharmila.quizsphere.entity.Question;
import com.sharmila.quizsphere.repository.QuestionRepository;
import com.sharmila.quizsphere.repository.QuizRepository;
import com.sharmila.quizsphere.repository.ResultRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class QuizServiceTest {

    @Mock
    private QuizRepository quizRepository;

    @Mock
    private QuestionRepository questionRepository;

    @Mock
    private ResultRepository resultRepository;

    @InjectMocks
    private QuizService quizService;

    public QuizServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetQuestions() {

        Question q = new Question();
        q.setId(1L);
        q.setQuestionText("What is Java?");
        q.setOptionA("Language");
        q.setOptionB("OS");
        q.setOptionC("DB");
        q.setOptionD("Tool");

        when(questionRepository.findByQuizId(1L))
                .thenReturn(List.of(q));

        var result = quizService.getQuestionsByQuiz(1L);

        assertEquals(1, result.size());
    }
}