package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredientFactory.IngredientFactory;

/**
 * Created with IntelliJ IDEA
 */
public class NewYorkPizza extends Pizza {
    public NewYorkPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        setCheese(ingredientFactory.makeCheese());
        setSauce(ingredientFactory.makeSauce());
    }

    @Override
    public void finish() {
        System.out.println("纽约风味披萨完成！\n");
    }
}
