package com.spring.ai.llm.learning.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AiServiceTest {

    @Autowired
    AiService aiService;

    @Test
    public void getJoke(){
        var joke = aiService.getJoke("cat and mouse");
        System.out.println(joke);
    }
}
