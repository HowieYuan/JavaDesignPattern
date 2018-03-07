package factory.abstractFactory.ingredientFactory;

import factory.abstractFactory.ingredient.Cheese;
import factory.abstractFactory.ingredient.GoatCheese;
import factory.abstractFactory.ingredient.Sauce;
import factory.abstractFactory.ingredient.TomatoSauce;

/**
 * Created with IntelliJ IDEA
 */
public class NewYorkIngredientFactory implements IngredientFactory {
    @Override
    public Sauce makeSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese makeCheese() {
        return new GoatCheese();
    }
}
