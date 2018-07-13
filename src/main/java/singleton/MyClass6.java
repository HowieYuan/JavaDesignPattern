package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 双重检验锁  推荐
 * @Date 2018-07-12
 * @Time 19:55
 */
public class MyClass6 {
    /**
     * 添加 volatile 关键字
     */
    private volatile static MyClass6 myClass4;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass6() {
    }


    /**
     * 双重检验锁
     */
    public static MyClass6 getInstance() {
        if (myClass4 == null) {
            synchronized (MyClass4.class) {
                if (myClass4 == null) {
                    myClass4 = new MyClass6();
                }
            }
        }
        return myClass4;
    }
}
