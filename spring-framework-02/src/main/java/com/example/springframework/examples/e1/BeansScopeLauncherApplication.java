package com.example.springframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeansScopeLauncherApplication {

      public static void main(String[] args){
        try ( var context =  new AnnotationConfigApplicationContext(BeansScopeLauncherApplication.class)){

        }
    }
}
