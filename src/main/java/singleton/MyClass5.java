package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 懒汉式-代码块加锁  非线程安全
 * @Date 2018-07-12
 * @Time 20:04
 */
public class MyClass5 {
    private static MyClass5 myClass;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass5() {
    }


    /**
     * 同步代码块
     * 不能起到线程同步的作用
     */
    public static MyClass5 getInstance() {
        if (myClass == null) {
            synchronized (MyClass5.class) {
                myClass = new MyClass5();
            }
        }
        return myClass;
    }
}
