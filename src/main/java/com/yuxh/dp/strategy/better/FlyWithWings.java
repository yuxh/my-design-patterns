package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 15:53
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with wings is good");
    }
}
