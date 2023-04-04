package com.example.chatbotproject.controller;

import com.example.chatbotproject.dtos.UserRequest;
import com.example.chatbotproject.dtos.UserResponse;
import com.example.chatbotproject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RequestMapping("/api/v1/chat")
@RestController
public class UserController {

    private final UserService userService;
    @PostMapping("/registerUser")
    public ResponseEntity<UserResponse> registerUser(@RequestBody UserRequest userRequest)  {
        UserResponse response = userService.registerUser(userRequest);
        return new ResponseEntity<>(response, OK);
    }
//    @PostMapping("/loginUser")
//    public ResponseEntity<UserResponse> loginUser( @RequestBody UserRequest userRequest)  {
//        UserResponse response = userService.loginUser(userRequest);
//        return new ResponseEntity<>(response, OK);
//    }
}
