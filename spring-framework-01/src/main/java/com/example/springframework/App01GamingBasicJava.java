package com.example.springframework;

import com.example.springframework.game.GameRunner;
import com.example.springframework.game.PackMan;

public class App01GamingBasicJava {

    public static void main(String[] args){
        //var game = new MarioGame();
        var game = new PackMan();
       // var game = new SuperContra();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
