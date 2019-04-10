package com.example.demo.service.impl;

import com.example.demo.dao.MybatisMapper;
import com.example.demo.model.Person;
import com.example.demo.service.MybatisService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
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

    @Override
    public Boolean ifExist() {
        Integer integer = mybatisMapper.ifExist();
        return integer == 1;
    }

    @Override
    public List<String> getPs(String code) {
        ArrayList<String> list = Lists.newArrayList(code);
        String pcode = mybatisMapper.findByCode(code);
        while (!StringUtils.isEmpty(pcode)) {
            list.add(pcode);
            pcode = mybatisMapper.findByCode(pcode);
        }
        return list;
    }
}

