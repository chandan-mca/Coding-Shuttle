package com.codingshuttle.anuj.week1Introduction.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {

    void eatApple() {
        System.out.println("I am eating the apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Creating the apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the Apple bean");
    }

}
