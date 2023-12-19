package com.example.springframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springframework.examples.c1")
public class LauncherApplication {

      public static void main(String[] args){
        try ( var context =  new AnnotationConfigApplicationContext
                (LauncherApplication.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());

        }
    }
}
