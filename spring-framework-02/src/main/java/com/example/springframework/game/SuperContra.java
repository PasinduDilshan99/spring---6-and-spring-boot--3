package com.example.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GameConsole {
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("sit down");
    }
    public void left(){
        System.out.println("back");
    }
    public void right(){
        System.out.println("shoot a bullet");
    }
}
