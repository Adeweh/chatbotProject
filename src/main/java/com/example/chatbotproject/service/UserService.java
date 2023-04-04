package com.example.chatbotproject.service;

import com.example.chatbotproject.dtos.UserRequest;
import com.example.chatbotproject.dtos.UserResponse;

public interface UserService {
    UserResponse registerUser(UserRequest userRequest);

    UserResponse loginUser(UserRequest userRequest);
    UserResponse deleteUser(String email);


}
