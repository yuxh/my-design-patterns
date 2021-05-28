package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 15:55
 */
public class Quack implements QuackBehavior{
    @Override
    public void quake() {
        System.out.println("love quack");
    }
}
