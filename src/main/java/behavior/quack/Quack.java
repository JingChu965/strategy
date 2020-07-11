package behavior.quack;

/**
 * @description: 鸭子呱呱叫
 * @author: 赵波
 * @createtime :2020-06-28 15:53:14
 **/
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("这种鸭子呱呱叫");
    }
}
