package com.autoparts.controller;

import org.springframework.http.ResponseEntity;
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

    @GetMapping("sold")
    private String getSoldParts() {
        return "part a";
    }

    @GetMapping("available")
    private String getAvailableParts() {
        return "part b, part c";
    }

    @GetMapping("quantity left")
    private String getQuantityParts() {
        return "part b = 4 , part c = 3";
    }

    @GetMapping("ordered part")
    private String getOrderedPart() {
    return "part b = 1, part c = 2";
  }

   @GetMapping("order cancelled")
   private String getOrderCancelled () {
    return "part b = 1";
  }

}
