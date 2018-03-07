package factory.easyFactory;

import factory.factoryMethod.Pizza;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:04
 */
public class PizzaStore {
    private Pizza pizza;
    private PizzaFactory pizzaFactory;

    public PizzaStore() {
        pizzaFactory = new PizzaFactory();
    }

    public Pizza orderPizza(String type) {
        pizza = pizzaFactory.makePizza(type);
        if (pizza == null) {
            System.out.println("没有该风味的披萨！");
            return pizza;
        }
        pizza.cut();
        pizza.box();
        pizza.finish();
        return pizza;
    }
}
