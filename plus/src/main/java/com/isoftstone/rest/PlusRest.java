package com.isoftstone.rest;

import com.isoftstone.api.PlusApi;
import com.isoftstone.service.PlusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlusRest implements PlusApi {
    @Autowired
    private PlusService plusService;
    @Override
    public Integer plus(@RequestParam("a") Integer a , @RequestParam("b") Integer b){
        return plusService.plus(a,b);
    }
}
