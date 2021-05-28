package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:10
 */
public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("looks like a redhead!");
    }

}
