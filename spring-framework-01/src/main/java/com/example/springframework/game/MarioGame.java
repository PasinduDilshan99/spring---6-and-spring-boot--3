package com.example.springframework.game;

public class MarioGame implements GameConsole {

    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go to hole");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("accelerate");
    }
}
