package com.autoparts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("orderedparts")
public class OrderedPartsController {

    @GetMapping("order")
    private String getAllParts() {
        return "order a, order b, order c";
    }
}