package com.isoftstone.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/minus")
public interface MinusApi {
    @PostMapping("minus")
    Integer minus(@RequestParam("a") Integer a , @RequestParam("b") Integer b);
}
