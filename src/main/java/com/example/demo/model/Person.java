package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private Long id;
    private String code;
    private String name;
    private int age;
    private String pcode;
    private List<Person> child;
}
