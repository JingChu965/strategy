package behavior.swim;

/**
 * @description: 不会游泳
 * @author: 赵波
 * @createtime :2020-06-28 16:01:13
 **/
public class SwimNoWay implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("这种鸭子不会游泳");
    }
}
