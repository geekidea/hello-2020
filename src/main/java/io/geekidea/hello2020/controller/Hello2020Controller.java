package io.geekidea.hello2020.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geekidea
 * @date 2024/7/17
 **/
@RestController
@RequestMapping("/hello2020")
public class Hello2020Controller {

    @GetMapping("/hello")
    public String hello(String name){
        System.out.println("name = " + name);
        return "hello:"+name;
    }

}
