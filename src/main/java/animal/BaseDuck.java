package animal;

import behavior.fly.FlyBehavior;
import behavior.quack.QuackBehavior;
import behavior.swim.SwimBehavior;

/**
 * @description: 鸭子抽象父类：定义鸭子共有的一些属性，和即将有的一些行为
 * @author: 赵波
 * @createtime :2020-06-28 15:18:00
 **/
public abstract class BaseDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public void performaQuack() {
        quackBehavior.quack();
    }

    public void perfomaSwim() {
        swimBehavior.swim();
    }

    /**
     * 实现描述外观
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}