package factory.factoryMethod;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 纽约风味披萨
 * @date 2018-02-06
 * @time 16:53
 */
public class NewYorkPizza extends Pizza {
    public NewYorkPizza() {
        setName("纽约风味披萨");
        setSauce("番茄酱");
    }

    /**
     *
     *
     * @date
     * @param
     * @return
     */
    @Override
    public void finish() {
        System.out.println("纽约风味披萨完成！\n");
    }

    @Override
    public void cut() {
        System.out.println("将" + getName() + "切成 4 份");
    }
}
