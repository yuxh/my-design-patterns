package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:11
 */
public class RubberDuck extends Duck {

    RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = () -> System.out.println("Squeak function");
    }


    @Override
    void display() {
        System.out.println("looks like a Rubber!");
    }
}
