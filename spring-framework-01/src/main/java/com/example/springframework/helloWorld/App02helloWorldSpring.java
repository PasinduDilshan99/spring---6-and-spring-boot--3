package com.example.springframework.helloWorld;


import com.example.springframework.helloWorld.Address;
import com.example.springframework.helloWorld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02helloWorldSpring {

    public static void main(String[] args){

        // Launch a Spring Context
        try ( var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            // Configure the things that we want Spring to manage
            // helloWorldConfiguration - @Configuration
            // name - @Bean

            // Retrieving Beans Managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            // System.out.println(context.getBean("person"));
            //System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));
            //System.out.println(context.getBean("newAddress1"));
            System.out.println(context.getBean(Address.class));
        }
    }
}
