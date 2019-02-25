package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 饿汉-急切创建-静态代码块 线程安全 可以选用
 * @Date 2018-07-12
 * @Time 21:00
 */
public class MyClass3 {
    private static MyClass3 myClass;

    static {
        myClass = new MyClass3();
    }

    private MyClass3() {
    }

    public static MyClass3 getInstance() {
        return myClass;
    }
}
