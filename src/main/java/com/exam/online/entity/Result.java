package com.exam.online.entity;

import jakarta.persistence.*;

@Entity
public class Result {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private Long userId;
 private int score;
 private int totalQuestions;

 public Long getId(){ return id; }
 public void setId(Long id){ this.id=id; }

 public Long getUserId(){ return userId; }
 public void setUserId(Long userId){ this.userId=userId; }

 public int getScore(){ return score; }
 public void setScore(int score){ this.score=score; }

 public int getTotalQuestions(){ return totalQuestions; }
 public void setTotalQuestions(int totalQuestions){ this.totalQuestions=totalQuestions; }

}