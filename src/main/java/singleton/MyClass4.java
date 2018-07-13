package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 懒汉式-方法加锁  效率低-不推荐
 * @Date 2018-03-10
 * @Time 22:51
 */
public class MyClass4 {
    private static MyClass4 myClass;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass4() {
    }


    /**
     * 加锁
     * 虽然做到了线程安全，并且解决了多实例的问题，但是效率太低。
     * 因为在任何时候只能有一个线程调用 getInstance() 方法
     */
    public synchronized static MyClass4 getInstance() {
        if (myClass == null) {
            myClass = new MyClass4();
        }
        return myClass;
    }
}
