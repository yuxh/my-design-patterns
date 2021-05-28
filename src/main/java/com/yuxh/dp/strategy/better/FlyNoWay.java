package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 15:53
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cann't fly");
        throw new UnsupportedOperationException("#fly()");
    }
}
