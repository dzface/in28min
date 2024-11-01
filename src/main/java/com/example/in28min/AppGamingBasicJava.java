package com.example.in28min;

import com.example.in28min.game.GameRunner;
import com.example.in28min.game.MarioGame;
import com.example.in28min.game.SuperContra;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContra = new SuperContra();
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();
    }
}
