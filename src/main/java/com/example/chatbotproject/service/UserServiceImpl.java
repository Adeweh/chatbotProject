package com.example.chatbotproject.service;

import com.example.chatbotproject.dtos.UserRequest;
import com.example.chatbotproject.dtos.UserResponse;
import com.example.chatbotproject.model.User;
import com.example.chatbotproject.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public UserResponse registerUser(UserRequest userRequest) {
        if (userRepository.existsByEmail(userRequest.getEmail()))
            throw new RuntimeException("Email address taken");
            User user = new User();
            user.setEmail(userRequest.getEmail());
            user.setPassword(userRequest.getPassword());
            userRepository.save(user);
        return new UserResponse("User added successfully");
    }
//    @Override
//    public UserResponse loginUser(UserRequest userRequest) {
//        User user = userRepository.findByEmail(userRequest.getEmail()).orElseThrow(
//                ()-> new RuntimeException("User no dey here")
//        );
//        if (user.getPassword().equals(userRequest.getPassword())){
//
//        }
//
//        return new UserResponse("Login Successful");
//    }
//
//    @Override
//    public UserResponse deleteUser(String email) {
//        User userToDelete = userRepository.findByEmail(email);
//        userRepository.delete(userToDelete);
//        return new UserResponse("User deleted");
//    }
}
