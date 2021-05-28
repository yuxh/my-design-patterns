package com.yuxh.dp.strategy.originalInterface;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:10
 */
public class ReadheadDuck extends Duck implements Flyable, Quackable {
    @Override
    void display() {
        System.out.println("looks like a redhead!");
    }

    @Override
    public void fly() {
        System.out.println("I can fly like !");
    }

    @Override
    public void quake() {
        System.out.println("every duck should quake");
    }
}
