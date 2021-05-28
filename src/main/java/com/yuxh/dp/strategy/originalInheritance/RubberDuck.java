package com.yuxh.dp.strategy.originalInheritance;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:11
 */
public class RubberDuck extends Duck{
    @Override
    void quake(){
        System.out.println("I squeak!");
    }

    @Override
    void fly() {
        System.out.println("I can not fly!");
        throw new UnsupportedOperationException("#fly()");
    }

    @Override
    void display() {
        System.out.println("looks like a Rubber!");
    }
}
