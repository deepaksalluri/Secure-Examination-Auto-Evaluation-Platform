package com.exam.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.online.entity.Question;

public interface QuestionRepository extends JpaRepository<Question,Long> {

}