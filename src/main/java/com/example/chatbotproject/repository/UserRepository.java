package com.example.chatbotproject.repository;

import com.example.chatbotproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    Boolean existByEmail(String email);

}
