package com.faydan.book.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fay_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;


    private String password;


    private Integer integral;

}