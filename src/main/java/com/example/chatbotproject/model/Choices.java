package com.example.chatbotproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Choices {
    private Message message;
    private String finish_reason;
    private int index;
}
