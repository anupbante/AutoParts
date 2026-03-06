package com.autoparts.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("parts")
public class PartsController {


    @GetMapping("all")
    private String getAllParts() {
        return "part a, part b, part c";
    }
}