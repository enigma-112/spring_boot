package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example {

    // Field Injection

//    @Autowired
//    A a;
//
//    @Autowired
//    B b;

    A a;
    B b;

    // Constructor Injection
    @Autowired
    Example(A a, B b) {
        this.a = a;
        this.b = b;
    }

    // Setter Injection
//    @Autowired
//    public void setA(A a) {
//        this.a = a;
//    }
//
//    @Autowired
//    public void setB(B b) {
//        this.b = b;
//    }

    @Override
    public String toString() {
        return "Example Class => A : " + a + ", B: " + b;
    }
}
