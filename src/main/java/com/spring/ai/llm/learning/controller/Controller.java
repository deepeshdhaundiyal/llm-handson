package com.spring.ai.llm.learning.controller;

import com.spring.ai.llm.learning.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AiService aiService;

    @GetMapping("ai/joke")
    public String getJoke(@RequestParam String topic){
        return aiService.getJoke(topic);
    }
}
