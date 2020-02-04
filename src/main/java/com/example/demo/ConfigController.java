package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigController
 * @Description TODO
 * @Date 2020/2/3 19:21
 * @Created by sparkxiong
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${username:lili}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }
}
