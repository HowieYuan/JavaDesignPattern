package factory.easyFactory;

import factory.factoryMethod.CheesePizza;
import factory.factoryMethod.PepperoniPizza;
import factory.factoryMethod.Pizza;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 简单工厂
 * @date 2018-02-02
 * @time 22:11
 *
 */
public class PizzaFactory {
    public PizzaFactory() {
        System.out.println("创建披萨工厂！");
    }

    /**
     *
     * @param type
     * @return
     */
    public Pizza makePizza(String type) {
        Pizza pizza;
        if ("PepperoniPizza".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("CheesePizza".equals(type)) {
            pizza = new CheesePizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
