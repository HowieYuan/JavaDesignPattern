package adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-14
 * @Time 22:26
 */
public class Hen implements Chicken {
    @Override
    public void jump() {
        System.out.println("母鸡跳了起来！");
    }
}
