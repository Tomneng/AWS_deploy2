package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @Test
    void hello(){
        System.out.println("port = " + port);
        ResponseEntity<String> response =  restTemplate.getForEntity("/aws/v2", String.class);
        assertEquals("<h1>AWS 재배포 v2</h1>", response.getBody());
    }








}