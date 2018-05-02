package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "fay_collect")
public class Collect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "create_time")
    private Date createTime;

}