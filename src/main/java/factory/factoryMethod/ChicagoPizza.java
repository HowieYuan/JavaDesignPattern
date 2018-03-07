package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-06
 * @time 16:54
 */
public class ChicagoPizza extends Pizza {
    public ChicagoPizza() {
        setName("芝加哥风味披萨");
        setSauce("番茄酱");
    }

    @Override
    public void finish() {
        System.out.println("芝加哥风味披萨完成！\n");
    }

    @Override
    public void box() {
        System.out.println("将" + getName() +"包装入精装盒");
    }
}
