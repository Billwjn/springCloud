package com.isoftstone.rest;

import com.isoftstone.api.MinusApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinusRest implements MinusApi {
    @Override
    public Integer minus(Integer a, Integer b) {
        return a-b;
    }
}
