package com.example.chatbotproject.service;

import com.example.chatbotproject.dtos.ChatBoxRequest;
import com.example.chatbotproject.repository.ResponseRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
@AllArgsConstructor
public class ChatBoxServiceImpl implements ChatBoxService{

    private final RestTemplate restTemplate;
    private final ResponseRepository repository;

    private final String addToken = System.getenv("SECRET.KEY");
    private final String addURL = System.getenv("URL");
    @Override
    public Object callExternalAPI(ChatBoxRequest chatBoxRequest) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, "Bearer " + addToken );
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<?> httpEntity = new HttpEntity<>(chatBoxRequest, httpHeaders);
        ResponseEntity<?> response = restTemplate.exchange(addURL, HttpMethod.POST, httpEntity, Object.class);
//        repository.save(response);

        return response.getBody();
    }
}
