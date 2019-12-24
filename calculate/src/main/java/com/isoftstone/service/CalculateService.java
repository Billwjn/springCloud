package com.isoftstone.service;

import com.isoftstone.api.MinusApi;
import com.isoftstone.api.PlusApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {
    @Autowired
    private PlusApi plusApi;
    @Autowired
    private MinusApi minusApi;
    public Integer plus(Integer a , Integer b){
        return plusApi.plus(a,b);
    }
    public Integer minus(Integer a , Integer b){
        return minusApi.minus(a,b);
    }
}
