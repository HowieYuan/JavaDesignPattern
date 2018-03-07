package decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 饮料装饰者类
 * @date 2018-01-29
 * @time 21:23
 */
public abstract class AbstractBeverageDecorator extends AbstractBeverage {
    private AbstractBeverage abstractBeverage;

    public AbstractBeverageDecorator(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    public AbstractBeverage getAbstractBeverage() {
        return abstractBeverage;
    }
}
