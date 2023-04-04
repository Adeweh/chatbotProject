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
        if (userRepository.existByEmail(userRequest.getEmail())) {
            throw new RuntimeException("Email address taken");
        }else{
            User user = new User();
            user.setEmail(user.getEmail());
            user.setPassword(userRequest.getPassword());
            userRepository.save(user);
        }
        return new UserResponse("User added successfully");
    }

    @Override
    public UserResponse loginUser(UserRequest userRequest) {
        User user = userRepository.findByEmail(userRequest.getEmail());
        if(user == null)
            throw new RuntimeException("User not yet registered");
        else if(!user.getPassword().equals(userRequest.getPassword())){
            throw new RuntimeException("Password Incorrect");
        }
        UserResponse response = new UserResponse();
        response.setMessage("Logged in successfully. Welcome back!");

        return response;
    }

    @Override
    public UserResponse deleteUser(String email) {
        User userToDelete = userRepository.findByEmail(email);
        userRepository.delete(userToDelete);
        return new UserResponse("User deleted");
    }
}
