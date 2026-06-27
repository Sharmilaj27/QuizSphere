package com.sharmila.quizsphere.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharmila.quizsphere.dto.ResultDto;
import com.sharmila.quizsphere.service.ResultService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/results")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ResultController {

    private final ResultService resultService;

   @GetMapping("/user/{userId}")
public List<ResultDto> getUserResults(
        @PathVariable Long userId) {

    return resultService.getUserResults(userId);
}

   @GetMapping("/leaderboard")
public List<ResultDto> leaderboard() {

    return resultService.getLeaderboard();
}
    @GetMapping("/stats/attempts")
public Long attempts() {

    return resultService.totalAttempts();
}
}