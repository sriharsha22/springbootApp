package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by harsha on 8/15/17.
 */
@RestController
public class MyController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
