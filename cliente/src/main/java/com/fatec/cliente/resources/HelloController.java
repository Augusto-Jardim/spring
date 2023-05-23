package com.fatec.cliente.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "meu primeiro end point em java!!!";
    }
}
