package com.sharmila.quizsphere.repository;

import com.sharmila.quizsphere.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository
        extends JpaRepository<Result, Long> {

    List<Result> findByUserId(Long userId);

    List<Result> findByQuizId(Long quizId);
}