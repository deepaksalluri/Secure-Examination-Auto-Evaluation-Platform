package com.exam.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.exam.online.entity.Question;
import com.exam.online.entity.Result;
import com.exam.online.dto.AnswerRequest;
import com.exam.online.service.ExamService;

@RestController
@RequestMapping("/exam")
@CrossOrigin(origins = "*")   // allows frontend requests
public class ExamController {

 @Autowired
 private ExamService examService;


 // Fetch all questions for the exam
 @GetMapping("/questions")
 public List<Question> getQuestions() {

  return examService.getAllQuestions();
 }


 // Submit exam answers for a specific user
 @PostMapping("/submit/{userId}")
 public Result submitExam(@PathVariable Long userId,
                          @RequestBody List<AnswerRequest> answers) {

  return examService.submitAnswers(userId, answers);


 }

}