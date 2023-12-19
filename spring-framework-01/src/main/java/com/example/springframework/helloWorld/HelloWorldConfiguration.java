package com.example.springframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "name 1";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean
    public Person person(){
        var person = new Person("name 2",30, new Address("line", "city"));
        return person;
    }

    @Bean
    public Person person2(){
        return new Person(name(), age(), address2());
    }

    @Bean
    public Person person3(String name, int age, Address address){
        return new Person(name, age, address);
    }

//    @Bean(name = "newAddress1")
//    public Address address1(){
//        var address1 = new Address("lane 1", "city 1");
//        return address1;
//    }

    @Bean(name = "newAddress2")
    public Address address2(){
        var address2 = new Address("lane 2", "city 2");
        return address2;
    }
}
