package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredientFactory.IngredientFactory;
import factory.abstractFactory.pizza.Pizza;

/**
 * Created with IntelliJ IDEA
 */
public class ChicagoPizza extends Pizza {
    public ChicagoPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setCheese(ingredientFactory.makeCheese());
        setSauce(ingredientFactory.makeSauce());
    }

    @Override
    public void finish() {
        System.out.println("芝加哥风味披萨完成！\n");
    }
}
