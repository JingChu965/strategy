package behavior.fly;

/**
 * @description: 火箭动力飞行
 * @author: 赵波
 * @createtime :2020-06-28 16:13:14
 **/
public class FlyRock implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("拥有火箭一样速度的飞行");
    }
}
