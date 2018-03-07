package factory;

import factory.factoryMethod.NewYorkPizzaStore;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:19
 */
public class Test {
    public static void main(String[] args) {
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        newYorkPizzaStore.orderPizza("CheesePizza");
        newYorkPizzaStore.orderPizza("NewYorkPizza");
        newYorkPizzaStore.orderPizza("ChicagoPizza");
    }
}
