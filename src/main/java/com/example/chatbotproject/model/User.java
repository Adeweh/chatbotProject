package com.example.chatbotproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String userName;
    private Responses responses;
    private Prompts prompts;
}
