package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public Address address() {
        return new Address("Chandigarh", "India");
    }

    @Bean
    public Person person() {
        return new Person("Abhinav", 23, address());
    }

    @Bean
    public String person2MethodCall() {
        return "This is another method, possibly used for demo.";
    }
}