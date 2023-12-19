package com.example.springframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class SomeClass{
    private DependencyClass dependencyClass;

    public SomeClass(DependencyClass dependencyClass) {
        this.dependencyClass = dependencyClass;
        System.out.println("hello");
    }
   public void initialize(){
        dependencyClass.method1();
       dependencyClass.method2();
   }

}
@Component
class DependencyClass{

    @PostConstruct
    public void method1(){
        System.out.println("method 1");
    }

    @PreDestroy
    public void method2(){
        System.out.println("method 2");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

      public static void main(String[] args){
        try ( var context =  new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
          //  context.getBean(SomeClass.class).initialize();
        }
    }
}
