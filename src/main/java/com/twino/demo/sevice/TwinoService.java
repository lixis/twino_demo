package com.twino.demo.sevice;

import com.twino.demo.dto.LoanDto;
import org.springframework.stereotype.Service;

@Service
public class TwinoService {

    public String getLoanById(long id){
        return "new_loan";
    }

    public void createLoan(LoanDto dto) {
        dto.setName("new");
    }
}
