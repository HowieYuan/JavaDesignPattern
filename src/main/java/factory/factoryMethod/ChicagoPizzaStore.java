package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 芝加哥风味披萨分店
 * @date 2018-02-06
 * @time 16:51
 */
public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 不一样的风味加盟店有不一样的菜单
     */
    @Override
    public Pizza makePizzaFactory(String type) {
        Pizza pizza;
        if ("PepperoniPizza".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("CheesePizza".equals(type)) {
            pizza = new CheesePizza();
        } else if ("ChicagoPizza".equals(type)) {
            pizza = new ChicagoPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
