package com.example.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameConsole game;
    public GameRunner(@Qualifier("MarioGameQualifier") GameConsole game){
        this.game = game;
    }
    public void run() {
        System.out.println("running Game : " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }


}
