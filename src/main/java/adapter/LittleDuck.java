package adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-14
 * @Time 22:22
 */
public class LittleDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("鸭子飞啦！");
    }
}
