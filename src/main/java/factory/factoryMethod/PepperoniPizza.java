package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:09
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        setName("意大利香肠披萨");
        setSauce("番茄酱");
    }

    @Override
    public void finish() {
        System.out.println("意大利香肠披萨完成！\n");
    }
}
