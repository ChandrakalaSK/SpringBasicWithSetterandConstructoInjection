package com.example.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile() {
        System.out.println("Code change in laptop");
    }
}
