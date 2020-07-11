package behavior.fly;

/**
 * @description: 飞行实际动作
 * @author: 赵波
 * @createtime :2020-06-28 15:48:36
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这种鸭子实现了飞行");
    }
}
