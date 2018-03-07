package factory.abstractFactory.store;


import factory.abstractFactory.pizza.ChicagoPizza;
import factory.abstractFactory.ingredientFactory.ChicagoIngredientFactory;
import factory.abstractFactory.ingredientFactory.IngredientFactory;
import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.PepperoniPizza;
import factory.abstractFactory.pizza.Pizza;

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
        IngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        Pizza pizza;
        if ("PepperoniPizza".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
        } else if ("CheesePizza".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
        } else if ("ChicagoPizza".equals(type)) {
            pizza = new ChicagoPizza(ingredientFactory);
        } else {
            pizza = null;
        }
        return pizza;
    }
}
