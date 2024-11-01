package com.example.in28min;

import com.example.in28min.game.GameRunner;
import com.example.in28min.game.PackManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContra();
        var game = new PackManGame();
        // 인터페이스가 없을때는 원래 게임을 매개변수로 적용할때
        // 매번 게임명을 명시하고 연관된 클래스의 코드를 수정해야 하였으나(강한결합)
        // 인터페이스 하위에 게임명 클래스를 implement(구현)를 적용하면 매번 연관된 모든 코드를 바꿔줄 필요가 없음
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
