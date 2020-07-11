package animal;

import behavior.fly.FlyNoWay;
import behavior.quack.MuteQuack;
import behavior.swim.Swim;

/**
 * @description: 模型鸭子
 * @author: 赵波
 * @createtime :2020-06-28 16:11:12
 **/
public class MoudelDuck extends BaseDuck {
    public MoudelDuck() {
        flyBehavior = new FlyNoWay();
        swimBehavior = new Swim();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("这是一种模型鸭子");
    }
}
