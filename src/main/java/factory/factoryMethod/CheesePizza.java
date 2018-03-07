package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:06
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        setName("芝士披萨");
        setSauce("番茄酱");
    }

    @Override
    public void finish() {
        System.out.println("芝士披萨完成！\n");
    }
}
