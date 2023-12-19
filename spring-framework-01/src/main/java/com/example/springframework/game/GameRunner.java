package com.example.springframework.game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole game){
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
