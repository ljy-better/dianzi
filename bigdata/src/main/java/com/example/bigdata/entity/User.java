package com.example.bigdata.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "t_bigdata_user")
@Entity
@Data


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

}
