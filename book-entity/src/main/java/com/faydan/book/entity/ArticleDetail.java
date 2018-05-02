package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fay_article_detail")
public class ArticleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "article_id")
    private Integer articleId;

    private String content;

}