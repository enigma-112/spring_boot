package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("MarioGame - UP");
    }

    public void down() {
        System.out.println("MarioGame - DOWN");
    }

    public void left() {
        System.out.println("MarioGame - LEFT");
    }

    public void right() {
        System.out.println("MarioGame - RIGHT");
    }
}
