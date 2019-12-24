package com.isoftstone.service;

import org.springframework.stereotype.Service;

@Service
public class PlusService {
    public Integer plus(Integer a , Integer b){
        return a+b;
    }
}
