package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
    @Autowired
    private MybatisService mybatisService;
    @GetMapping("/findAll")
    public List<Person> findAll() {
        return mybatisService.findAll();
    }

    /**
     * 向下递归
     * @param pcode
     * @return
     */
    @GetMapping("/findTree/{pcode}")
    public List<Person> findTree(@PathVariable("pcode")String pcode) {
        return mybatisService.findTree(pcode);
    }
    /**
     *
     * @param
     * @return
     */
    @GetMapping("/ifExist")
    public Boolean ifExist() {
        return mybatisService.ifExist();
    }

    /**
     *向上递归
     * @param
     * @return
     */
    @GetMapping("/getPs/{code}")
    public List<String> getPs(@PathVariable("code")String code) {
        return mybatisService.getPs(code);
    }

}
