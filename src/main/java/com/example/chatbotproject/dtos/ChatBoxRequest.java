package com.example.chatbotproject.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class chatBoxRequest {
    private String model;
    private List<Chat> messages;
}
