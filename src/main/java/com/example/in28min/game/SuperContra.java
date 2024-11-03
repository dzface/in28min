package com.example.in28min.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("sit down");
    }
    public void left(){
        System.out.println("Go to back");
    }
    public void right(){
        System.out.println("Shoot a bullet");
    }
}
