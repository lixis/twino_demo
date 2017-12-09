package com.twino.demo.controller;

import com.twino.demo.sevice.TwinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class TwinoController {

    @Autowired
    private TwinoService twinoService;


    @GetMapping("/test")
    public String getLoan() {
        return twinoService.getLoanById(1);
    }

}