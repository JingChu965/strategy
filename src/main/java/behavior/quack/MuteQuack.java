package behavior.quack;

/**
 * @description: 不会叫
 * @author: 赵波
 * @createtime :2020-06-28 15:54:42
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("这种鸭子不会叫");
    }
}
