package com.yuxh.dp.strategy.originalInterface;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:05
 */
abstract class Duck {
    void swim() {
        System.out.println("every duck should swim");
    }


    abstract void display();
}
