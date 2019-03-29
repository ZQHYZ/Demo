package com.example.demo.service.impl;

import com.example.demo.dao.MybatisMapper;
import com.example.demo.model.Person;
import com.example.demo.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisServiceImpl implements MybatisService {
    @Autowired
    private MybatisMapper mybatisMapper;
    @Override
    public List<Person> findAll() {
        return mybatisMapper.findAll();
    }

    @Override
    public List<Person> findTree(String pcode) {
        return mybatisMapper.getCategory(pcode);
    }
}

