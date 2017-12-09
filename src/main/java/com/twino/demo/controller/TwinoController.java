package com.twino.demo.controller;

import com.twino.demo.dto.LoanDto;
import com.twino.demo.sevice.TwinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class TwinoController {

    @Autowired
    private TwinoService twinoService;


    @GetMapping("/loan/{id}")
    public String getLoan(@PathVariable long id) {
        return twinoService.getLoanById(id);
    }

    @PostMapping("/loan")
    public void createLoan(@RequestBody LoanDto dto){
        twinoService.createLoan(dto);
    }

}