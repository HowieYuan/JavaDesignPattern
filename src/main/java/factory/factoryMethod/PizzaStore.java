package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:04
 */
@SuppressWarnings("Duplicates")
public abstract class PizzaStore {
    private Pizza pizza;

    public Pizza orderPizza(String type) {
        pizza = makePizzaFactory(type);
        if (pizza == null) {
            System.out.println("没有该风味的披萨！\n");
            return pizza;
        }
        pizza.cut();
        pizza.box();
        pizza.finish();
        return pizza;
    }

    /**
     * 工厂方法，将行为封装在子类中
     */
    public abstract Pizza makePizzaFactory(String type);
}
