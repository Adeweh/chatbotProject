package com.example.chatbotproject.controller;

import com.example.chatbotproject.dtos.ChatBoxRequest;
import com.example.chatbotproject.service.ChatBoxService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping("/api/v1/chat")
@RestController

public class ChatBotController {
    private final ChatBoxService chatBoxService;

    @PostMapping("/response/{email}")
    public ResponseEntity<?> callExternalAPI(@PathVariable String email,  @RequestBody ChatBoxRequest chatBoxRequest){
        return ResponseEntity.ok(chatBoxService.callExternalAPI(email, chatBoxRequest));
    }
}
