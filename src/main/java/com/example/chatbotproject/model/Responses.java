package com.example.chatbotproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Responses {
    @Id
    private String Id;
    private String contents;
}
