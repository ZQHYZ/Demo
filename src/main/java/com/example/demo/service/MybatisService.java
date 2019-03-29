package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface MybatisService {
    List<Person> findAll();

    List<Person> findTree(String pcode);
}
