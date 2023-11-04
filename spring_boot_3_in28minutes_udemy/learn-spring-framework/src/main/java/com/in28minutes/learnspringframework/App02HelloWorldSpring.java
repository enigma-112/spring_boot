package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want Spring Framework to manage - @Configuration
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));

    }

}
