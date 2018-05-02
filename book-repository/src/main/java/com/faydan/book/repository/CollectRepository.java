package com.faydan.book.repository;

import com.faydan.book.entity.Collect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectRepository extends JpaRepository<Collect, Integer> {
}