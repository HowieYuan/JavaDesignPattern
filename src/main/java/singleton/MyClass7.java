package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 静态内部类 线程安全 推荐
 * @Date 2018-07-13
 * @Time 13:23
 */
public class MyClass7 {
    private MyClass7() {
    }

    /**
     * 装载 MyClass 类时，不会实例化，第一次调用getInstance()时将加载内部类 InnerClass
     */
    private static class InnerClass {
        private static final MyClass7 SINGLETON = new MyClass7();
    }

    private static MyClass7 getInstance() {
        return InnerClass.SINGLETON;
    }
}
