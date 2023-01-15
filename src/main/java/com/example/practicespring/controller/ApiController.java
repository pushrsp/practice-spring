package com.example.practicespring.controller;

import com.example.practicespring.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    /* text */
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    /* json */
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto userDto) {
        return userDto;
    }

    /* response customize */
    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    /* html */
    @GetMapping("/html")
    public String html() {
        return "main.html";
    }

}
