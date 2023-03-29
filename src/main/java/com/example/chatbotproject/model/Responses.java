package com.example.chatbotproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document
public class Responses {
    private String id;
    private String object;
    private String created;
    private String model;
    private Usage usage;
    private List<Choices> choices;


}
