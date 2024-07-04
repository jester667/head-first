package com.example.headfirst.strategy.duck.steptwo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Duck {

    private final QuackBehavior quackBehavior;

    private final FlyBehavior flyBehavior;


    public void swim() {
        System.out.println("Плыву");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

}
