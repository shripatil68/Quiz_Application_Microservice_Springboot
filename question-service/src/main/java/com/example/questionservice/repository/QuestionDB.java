package com.example.questionservice.repository;

import com.example.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDB extends JpaRepository<Question, Integer> {


    List<Question> findByCategory(String category);

    //@Query(value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    @Query(value = "SELECT q.id FROM question q WHERE q.category=?1 ORDER BY RAND() LIMIT ?2", nativeQuery = true)
    List<Integer> findRandomQuestionByCategory(String category, int numQ);
}
