package com.twino.demo.sevice;

import org.springframework.stereotype.Service;

@Service
public class TwinoService {

    public String getLoanById(long id){
        return "new_loan";
    }
}
