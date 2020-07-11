package animal;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;
import behavior.swim.Swim;

/**
 * @description: 绿头鸭
 * @author: 赵波
 * @createtime :2020-06-28 16:02:08
 **/
public class MallardDuck extends BaseDuck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        swimBehavior = new Swim();
    }
    @Override
    public void display(){
        System.out.println("这是一个绿头鸭");
    }
}
