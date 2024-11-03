package com.example.in28min;

import com.example.in28min.game.GameRunner;
import com.example.in28min.game.GamingConsole;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.in28min.game")
public class GamingAppLauncherApplication {
    @Bean
    public GameRunner gameRunner(@Qualifier("SuperContraQualifier") GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }




    }


}


