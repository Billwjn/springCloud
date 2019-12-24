package com.isoftstone.web;

import com.isoftstone.api.PlusApi;
import com.isoftstone.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculate")
public class CalculateController {
    @Autowired
    private CalculateService calculateService;
    @GetMapping
    public Integer plus(@RequestParam("a") Integer a , @RequestParam("b") Integer b){
        return calculateService.plus(a,b);
    }
    @GetMapping("minus")
    public Integer minus(Integer a , Integer b){
        return calculateService.minus(a,b);
    }
}
