package factory.abstractFactory.ingredientFactory;

import factory.abstractFactory.ingredient.Cheese;
import factory.abstractFactory.ingredient.Sauce;

/**
 * Created with IntelliJ IDEA
 */
public interface IngredientFactory {
    Sauce makeSauce();
    Cheese makeCheese();
}
