package com.faydan.book.repository;

import com.faydan.book.entity.Classify;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassifyRepository extends JpaRepository<Classify, Integer> {
}