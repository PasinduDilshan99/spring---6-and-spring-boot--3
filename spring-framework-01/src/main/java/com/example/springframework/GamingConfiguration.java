package com.example.springframework;

import com.example.springframework.game.GameConsole;
import com.example.springframework.game.GameRunner;
import com.example.springframework.game.PackMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game(){
        var game = new PackMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
