package com.example.chatbotproject.controller;

import com.example.chatbotproject.dtos.ChatBoxRequest;
import com.example.chatbotproject.service.ChatBoxService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/api/v1/chat")
@RestController

public class ChatBotController {
    private final ChatBoxService chatBoxService;

    @PostMapping("/response")
    public ResponseEntity<?> callExternalAPI(@RequestBody ChatBoxRequest chatBoxRequest){
        return ResponseEntity.ok(chatBoxService.callExternalAPI(chatBoxRequest));
    }
}
