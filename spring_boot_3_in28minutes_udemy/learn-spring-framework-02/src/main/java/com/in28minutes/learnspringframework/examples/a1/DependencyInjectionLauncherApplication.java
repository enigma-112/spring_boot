package com.in28minutes.learnspringframework.examples.a1;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.Expression;
import java.util.Arrays;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//            Example e  = new Example();
//            System.out.println("Example class : " + e);
            System.out.println(context.getBean(Example.class));
        }
    }

}
