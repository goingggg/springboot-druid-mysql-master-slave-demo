package com.example.dxfl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    @GetMapping(path = "/demo")
    public String demo() {

        return "demo";
    }
}
