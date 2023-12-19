package com.example.springframework;

import com.example.springframework.game.GameConsole;
import com.example.springframework.game.GameRunner;
import com.example.springframework.game.PackMan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBasicJava {

    public static void main(String[] args){

        try ( var context =  new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
