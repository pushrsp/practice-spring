package com.example.practicespring.controller;

import com.example.practicespring.dto.UserReqDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "get hello";
    }

    /* 옛날 방식 */
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "get hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable: " + pathName);
        return pathName;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParams) {
        StringBuilder sb = new StringBuilder();

        queryParams.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param2")
    public String queryParam2(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param3")
    public String queryParam3(UserReqDto userReq) {
        return userReq.toString();
    }

}
