package com.cotemig.springBoot.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String get() {
        return "Hello Word!";
    }
}
