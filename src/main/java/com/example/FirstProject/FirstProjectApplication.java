package com.example.FirstProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien alien= (Alien) context.getBean("alien");
		alien.code();
		System.out.println(alien.getAge());








	}

}
