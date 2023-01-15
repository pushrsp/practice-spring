package com.example.practicespring;

import com.example.practicespring.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringApplication {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        // object -> text getter 필요
        User user = new User("hi", 1);
        String text = objectMapper.writeValueAsString(user);

        System.out.println(text);

        // text -> object 기본 생성자 필요
        User result = objectMapper.readValue(text, User.class);

        System.out.println(user.getName());

//        SpringApplication.run(PracticeSpringApplication.class, args);
    }

}
