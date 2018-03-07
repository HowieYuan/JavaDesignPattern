package decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 牛奶配料
 * @date 2018-01-29
 * @time 21:26
 */
public class Milk extends AbstractBeverageDecorator {
    private float price = 1;
    private String description = "Milk";

    public Milk(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public String getDescription() {
        return super.getAbstractBeverage().getDescription() + " + " + description;
    }

    @Override
    public float cost() {
        return super.getAbstractBeverage().cost() + price;
    }
}
