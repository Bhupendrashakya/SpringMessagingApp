package com.Spring.SpringMessagingApp.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

    // curl localhost:8080/hello/query?name=Mark -w "\n"
    @GetMapping("/query")
    public String sayHello(@RequestParam(value = "name", defaultValue = "User") String name) {
        return "Hello " + name + " from BridgeLabz!";
    }



}