package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 懒汉式-急切创建 线程安全 可以选用
 * @Date 2018-03-10
 * @Time 22:49
 */
public class MyClass2 {
    /**
     * 急切创建
     *
     * 缺点：没有实现 Lazy-Loading “延迟实例化”，在类装载的时候，就进行了实例化
     */
    private final static MyClass2 MYCLASS = new MyClass2();

    private MyClass2() {
    }

    public static MyClass2 getInstance() {
        return MYCLASS;
    }
}
