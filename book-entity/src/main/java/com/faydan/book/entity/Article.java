package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "fay_article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String author;

    private String cover;

    private Integer length;

    private String info;

    @Column(name = "classify_id")
    private Integer classifyId;

    private Integer collect;

    private Integer recommend;

    private Integer ticket;

    private Byte state;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

}