package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredientFactory.IngredientFactory;

/**
 * Created with IntelliJ IDEA
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setCheese(ingredientFactory.makeCheese());
        setSauce(ingredientFactory.makeSauce());
    }

    @Override
    public void finish() {
        System.out.println("意大利香肠披萨完成！\n");
    }
}
