package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public Person person(){
    }

    @Bean
    public Public person2MethodCall(){
    }

    @Bean
    public Address address(){

    }

    @Bean
    public String address2(){

    }

}