package com.example.chatbotproject.repository;

import com.example.chatbotproject.model.Responses;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResponseRepository extends MongoRepository<Responses, String> {
}
