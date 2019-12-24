package com.isoftstone.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/plus")
public interface PlusApi {
    @PostMapping("plus")
    Integer plus(@RequestParam("a") Integer a , @RequestParam("b") Integer b);
}
