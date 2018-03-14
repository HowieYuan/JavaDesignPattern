package adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-14
 * @Time 22:27
 */
public class ChickenToDuckAdapter implements Duck {
    private Chicken chicken;

    public ChickenToDuckAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void fly() {
        chicken.jump();
    }
}
