package com.slience.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("index")
@RestController
public class IndexController {

    @RequestMapping("hello")
    public String hello () {
        return "hello world";
    }

    @RequestMapping("greeting")
    public String greeting () {
        return "hello world, greeting";
    }
}
