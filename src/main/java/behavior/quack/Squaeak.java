package behavior.quack;

/**
 * @description: 吱吱叫
 * @author: 赵波
 * @createtime :2020-06-28 15:54:18
 **/
public class Squaeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("这种鸭子吱吱叫");
    }
}
