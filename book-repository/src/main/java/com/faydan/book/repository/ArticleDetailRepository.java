package com.faydan.book.repository;

import com.faydan.book.entity.ArticleDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDetailRepository extends JpaRepository<ArticleDetail, Long> {
}