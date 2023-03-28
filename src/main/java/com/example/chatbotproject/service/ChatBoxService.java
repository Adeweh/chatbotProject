package com.example.chatbotproject.service;

import com.example.chatbotproject.dtos.ChatBoxRequest;
import org.springframework.stereotype.Service;

@Service
public interface ChatBoxService {
    Object callExternalAPI(ChatBoxRequest chatBoxRequest);
}
