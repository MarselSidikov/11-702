package ru.itis.springbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @GetMapping("/hello")
    @ResponseBody
    public String getHello() {
        return "Hello";
    }
}
