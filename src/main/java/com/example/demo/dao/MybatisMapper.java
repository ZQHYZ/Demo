package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;

public interface MybatisMapper {
    List<Person> findAll();

    List<Person> getCategory(String pcode);
}
