package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("SuperContra - UP");
    }

    public void down() {
        System.out.println("SuperContra - DOWN");
    }

    public void left() {
        System.out.println("SuperContra - LEFT");
    }

    public void right() {
        System.out.println("SuperContra - RIGHT");
    }
}
