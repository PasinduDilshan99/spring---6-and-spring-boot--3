package com.example.springframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("hello");
        this.classA = classA;
    }

    public String doSomething(){
       return "Do Something";
    }
}

@Configuration
@ComponentScan
public class LazyInitialisationLauncherApplication {

      public static void main(String[] args){
        try ( var context =  new AnnotationConfigApplicationContext
                (LazyInitialisationLauncherApplication.class)){
            System.out.println("end");
            System.out.println(context.getBean(ClassB.class).doSomething());
        }
    }
}
