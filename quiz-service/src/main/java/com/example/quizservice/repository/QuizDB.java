package com.example.quizservice.repository;

import com.example.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDB extends JpaRepository<Quiz, Integer> {
}
