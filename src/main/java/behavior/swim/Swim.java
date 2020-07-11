package behavior.swim;

/**
 * @description: 会游泳
 * @author: 赵波
 * @createtime :2020-06-28 16:00:40
 **/
public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("这种鸭子实现了游泳行为");
    }
}
