package com.example.chatbotproject.dtos;

import com.example.chatbotproject.model.Message;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatBoxRequest {
    private String model = "gpt-3.5-turbo";
    private List<Message> messages;
}
