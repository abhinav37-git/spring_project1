package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    //1: Launch a spring context
    //2: Configuration of things that we want to be managed by the spring framework

    var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
}
