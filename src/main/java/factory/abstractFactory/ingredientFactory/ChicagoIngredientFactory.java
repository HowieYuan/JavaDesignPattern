package factory.abstractFactory.ingredientFactory;

import factory.abstractFactory.ingredient.*;

/**
 * Created with IntelliJ IDEA
 */
public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public Sauce makeSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese makeCheese() {
        return new MozzarellaCheese();
    }
}
