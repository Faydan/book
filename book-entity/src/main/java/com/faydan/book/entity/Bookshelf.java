package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "fay_bookshelf")
public class Bookshelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "article_id")
    private Integer articleId;


    private Integer userId;

    @Column(name = "create_time")
    private Date createTime;

}