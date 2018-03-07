package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 纽约风味披萨分店
 * @date 2018-02-06
 * @time 16:51
 */
public class NewYorkPizzaStore extends PizzaStore {
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
        } else if ("NewYorkPizza".equals(type)) {
            pizza = new NewYorkPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
