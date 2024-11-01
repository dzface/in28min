package com.example.in28min.game;

public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Jump!");
    }
    public void down() {
        System.out.println("Go into hole");
    }
    public void left(){
        System.out.println("Go to back");
    }
    public void right(){
        System.out.println("Accelerate");
    }
}
