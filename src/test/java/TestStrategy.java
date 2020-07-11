
import animal.BaseDuck;
import animal.MallardDuck;
import behavior.fly.FlyRock;

/**
 * @description: 策略者模式测试类
 * @author: 赵波
 * @createtime :2020-06-28 16:07:58
 **/
public class TestStrategy {
    public static void main(String[] args) {
        System.out.println("<<<<<<---------->>>>>>>");
        BaseDuck mallard = new MallardDuck();
        mallard.performaQuack();
        mallard.performFly();
        mallard.perfomaSwim();
        mallard.display();
        System.out.println("<<<<<<---------->>>>>>>");
        BaseDuck moudel = new MallardDuck();
        moudel.performFly();
        moudel.setFlyBehavior(new FlyRock());
        moudel.performFly();
    }
}
