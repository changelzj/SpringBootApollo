package com.example;

import com.example.config.Constant;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestApp {

    @Resource
    private Constant constant;

    @Test
    public void tezt() {
        System.out.println(constant);
    }


}



