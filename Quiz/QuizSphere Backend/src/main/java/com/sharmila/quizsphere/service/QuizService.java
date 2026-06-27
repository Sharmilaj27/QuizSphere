package com.sharmila.quizsphere.service;

import com.sharmila.quizsphere.dto.AnswerRequest;
import com.sharmila.quizsphere.dto.QuestionResponse;
import com.sharmila.quizsphere.dto.QuizSubmissionRequest;
import com.sharmila.quizsphere.dto.ResultResponse;
import com.sharmila.quizsphere.entity.Question;
import com.sharmila.quizsphere.entity.Quiz;
import com.sharmila.quizsphere.entity.Result;
import com.sharmila.quizsphere.repository.QuestionRepository;
import com.sharmila.quizsphere.repository.QuizRepository;
import com.sharmila.quizsphere.repository.ResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizService {

    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final ResultRepository resultRepository;

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public List<QuestionResponse> getQuestionsByQuiz(Long quizId) {

        List<Question> questions =
                questionRepository.findByQuizId(quizId);

        return questions.stream()
                .map(q -> QuestionResponse.builder()
                        .id(q.getId())
                        .questionText(q.getQuestionText())
                        .optionA(q.getOptionA())
                        .optionB(q.getOptionB())
                        .optionC(q.getOptionC())
                        .optionD(q.getOptionD())
                        .build())
                .toList();
    }

    public ResultResponse submitQuiz(
            QuizSubmissionRequest request) {

        int score = 0;

        for (AnswerRequest answer : request.getAnswers()) {

            Question question =
                    questionRepository.findById(
                                    answer.getQuestionId())
                            .orElseThrow(() ->
                                    new RuntimeException(
                                            "Question not found"));

            if (question.getCorrectAnswer()
                    .equalsIgnoreCase(
                            answer.getSelectedAnswer())) {

                score++;
            }
        }

        int totalQuestions =
                request.getAnswers().size();

        Result result = Result.builder()
                .userId(request.getUserId())
                .quizId(request.getQuizId())
                .score(score)
                .totalQuestions(totalQuestions)
                .attemptedAt(LocalDateTime.now())
                .build();

        resultRepository.save(result);

        double percentage =
                ((double) score / totalQuestions) * 100;

        return ResultResponse.builder()
                .score(score)
                .totalQuestions(totalQuestions)
                .percentage(percentage)
                .build();
    }
}