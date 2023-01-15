package com.example.practicespring.dto;

public class User {
    private String name;
    private int age;

    public User() {
        this.name = null;
        this.age = 0;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
