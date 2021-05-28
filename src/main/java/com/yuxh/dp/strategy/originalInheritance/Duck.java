package com.yuxh.dp.strategy.originalInheritance;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:05
 */
abstract class Duck {
    void swim() {
        System.out.println("every duck should swim");
    }

    void quake() {
        System.out.println("every duck should quake");
    }
    void fly() {
        System.out.println("Let's fly!");
    }
    abstract void display();
}
