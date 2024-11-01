package com.example.in28min.game;

public class PackManGame implements GamingConsole {
    public PackManGame(){

    }

    @Override
    public void up() {
        System.out.println("GO to up with eating");
    }

    @Override
    public void down() {
        System.out.println("GO to down with eating");
    }

    @Override
    public void left() {
        System.out.println("GO to left with eating");
    }

    @Override
    public void right() {
        System.out.println("GO to right with eating");
    }
}
