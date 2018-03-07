package factory.abstractFactory.pizza;

import factory.abstractFactory.ingredient.Cheese;
import factory.abstractFactory.ingredientFactory.IngredientFactory;
import factory.abstractFactory.ingredient.Sauce;

/**
 * Created with IntelliJ IDEA
 */
public abstract class Pizza {
    IngredientFactory ingredientFactory;
    private String name;
    private Sauce sauce;
    private Cheese cheese;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public abstract void prepare();

    public void cut() {
        System.out.println("将" + name +"切成 8 份");
    }

    public void box() {
        System.out.println("将" + name + "装入纸盒");
    }

    public abstract void finish();
}
