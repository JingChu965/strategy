package behavior.fly;

/**
 * @description: 不会飞
 * @author: 赵波
 * @createtime :2020-06-28 15:49:10
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这种鸭子不会飞");
    }
}
