package com.spring.ai.llm.learning.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient chatClient){
        this.chatClient = chatClient;
    }
    public String getJoke(String topic){
        return chatClient.prompt()
                .user("Give me a joke in Hindi with the topic " + topic)
                .call()
                .content();
    }
}
