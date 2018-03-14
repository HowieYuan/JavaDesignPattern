package adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-14
 * @Time 22:28
 */
public class Test {
    public static void main(String[] args) {
        LittleDuck littleDuck = new LittleDuck();
        Hen hen = new Hen();
        littleDuck.fly();
        hen.jump();

        Duck duck = new ChickenToDuckAdapter(hen);
        duck.fly();
    }
}
