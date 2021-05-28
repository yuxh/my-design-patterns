package com.yuxh.dp.strategy.better;

/**
 * @author yuxh
 * @Date: 2021-05-28.
 * @Time: 10:05
 */
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performQuack() {
        quackBehavior.quake();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();
}
