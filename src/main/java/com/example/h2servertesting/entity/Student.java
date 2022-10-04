package com.example.h2servertesting.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity
@Entity
@Data
//defining class name as Table name
@Table
public class Student{
    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String email;

}