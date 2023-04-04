package com.example.chatbotproject.repository;

import com.example.chatbotproject.model.ResponseData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResponseRepository extends MongoRepository<ResponseData, String> {
}
