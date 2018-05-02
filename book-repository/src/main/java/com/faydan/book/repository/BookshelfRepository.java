package com.faydan.book.repository;

import com.faydan.book.entity.Bookshelf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface BookshelfRepository extends JpaRepository<Bookshelf, Integer> {
}