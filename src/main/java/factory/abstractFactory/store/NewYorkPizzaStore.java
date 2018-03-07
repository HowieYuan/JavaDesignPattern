package factory.abstractFactory.store;


import factory.abstractFactory.ingredientFactory.IngredientFactory;
import factory.abstractFactory.ingredientFactory.NewYorkIngredientFactory;
import factory.abstractFactory.pizza.CheesePizza;
import factory.abstractFactory.pizza.NewYorkPizza;
import factory.abstractFactory.pizza.Pizza;

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
        IngredientFactory ingredientFactory = new NewYorkIngredientFactory();
        Pizza pizza;
        if ("CheesePizza".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
        } else if ("NewYorkPizza".equals(type)) {
            pizza = new NewYorkPizza(ingredientFactory);
        } else {
            pizza = null;
        }
        return pizza;
    }
}
