package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname RestMyController
 * @Description TODO
 * @Date 2020/2/3 18:27
 * @Created by sparkxiong
 */
@RestController
public class RestMyController {

    @GetMapping("/hi")
    public String get(@RequestParam(value = "name", defaultValue = "wsx", required = false) String name) {
        return "provider"+name;
    }

}
