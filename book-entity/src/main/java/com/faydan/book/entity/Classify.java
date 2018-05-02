package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fay_classify")
public class Classify {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "parent_id")
    private Integer parentId;

    private Byte level;

}