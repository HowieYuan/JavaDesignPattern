package decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-29
 * @time 21:34
 */
public class Chocolate extends AbstractBeverageDecorator {
    private final float price = 1;
    private String description = "Chocolate";

    public Chocolate(AbstractBeverage abstractBeverage) {
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
