package com.yuxh.dp.strategy.originalInterface;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:11
 */
public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quake() {
        System.out.println("I squeak!");
    }


    @Override
    void display() {
        System.out.println("looks like a Rubber!");
    }
}
