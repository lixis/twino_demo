package com.twino.demo.contoller;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ContextConfiguration(classes = TwinoContollerTest.class)
public class TwinoContollerTest {

//    @Autowired
//    private TestRestTemplate restTemplate;


    @Test
    public void getLoanById_Success() {
        String body = restTemplate.getForObject("/test", String.class);

        Assertions.assertThat(body).isEqualTo("new_loan");
    }
}
