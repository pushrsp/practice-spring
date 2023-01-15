package com.example.practicespring.controller;

import com.example.practicespring.dto.UserDto;
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
}
