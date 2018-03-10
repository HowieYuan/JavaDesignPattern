package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-10
 * @Time 22:51
 */
public class MyClass3 {
    /**
     * 添加 volatile 关键字
     */
    private volatile static MyClass3 myClass3;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass3() {
    }

    /**
     * 多重检查加锁
     */
    public synchronized static MyClass3 getInstance() {
        if (myClass3 == null) {
            synchronized (MyClass3.class) {
                if (myClass3 == null) {
                    myClass3 = new MyClass3();
                }
            }
        }
        return myClass3;
    }
}
