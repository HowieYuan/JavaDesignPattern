package decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 首选咖啡
 * @date 2018-01-29
 * @time 21:18
 */
public class HouseBlend extends AbstractBeverage {
    private final float price = 5;
    private String description = "HouseBlend";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float cost() {
        return price;
    }
}
