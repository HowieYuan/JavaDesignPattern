package decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-29
 * @time 21:31
 */
public class Test {
    public static void main(String[] args) {
        AbstractBeverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Chocolate(houseBlend);
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());
    }
}
