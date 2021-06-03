package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 17:52
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ReadheadDuck();
        duck.performQuack();
        duck.performFly();

        System.out.println("RubberDuck here");
        Duck duck2 = new RubberDuck();
        duck2.performQuack();
    }
}
