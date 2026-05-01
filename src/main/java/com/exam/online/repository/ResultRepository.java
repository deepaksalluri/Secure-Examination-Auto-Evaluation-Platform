package com.exam.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exam.online.entity.Result;

public interface ResultRepository extends JpaRepository<Result,Long> {

}