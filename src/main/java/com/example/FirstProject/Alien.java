package com.example.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    Alien()
   {
       System.out.println("Alien object created");
   }
    public void code()
    {
        System.out.println("Coding");
        com.compile();
    }
}
