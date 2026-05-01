package com.exam.online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.exam.online.entity.Question;
import com.exam.online.entity.Result;
import com.exam.online.dto.AnswerRequest;
import com.exam.online.repository.QuestionRepository;
import com.exam.online.repository.ResultRepository;

@Service
public class ExamService {

 @Autowired
 QuestionRepository questionRepository;

 @Autowired
 ResultRepository resultRepository;

 public List<Question> getAllQuestions(){
  return questionRepository.findAll();
 }

 public Result submitAnswers(Long userId, List<AnswerRequest> answers){

  int score = 0;

  for(AnswerRequest ans : answers){

   Question q = questionRepository.findById(ans.getQuestionId()).get();

   if(q.getCorrectAnswer().equals(ans.getSelectedAnswer())){
    score++;
   }

  }

  Result result = new Result();

  result.setUserId(userId);
  result.setScore(score);
  result.setTotalQuestions(answers.size());

  return resultRepository.save(result);
 }
}