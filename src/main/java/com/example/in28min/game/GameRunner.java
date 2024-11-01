package com.example.in28min.game;

public class GameRunner {
    private SuperContra game;
    public GameRunner(SuperContra game) {
        this.game = game;
    }
    public void run(){
        System.out.println("Running game : "+ game);
        game.up();game.down();game.left();game.right();
    }
}
