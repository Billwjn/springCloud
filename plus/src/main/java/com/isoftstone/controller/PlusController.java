package com.isoftstone.controller;

import com.isoftstone.service.PlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/plus")
public class PlusController {
    @Autowired
    private PlusService plusService;
    @GetMapping
    public Integer plus(Integer a , Integer b){
        return plusService.plus(a,b);
    }
}
