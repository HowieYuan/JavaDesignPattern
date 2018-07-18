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
     * 原因：myClass = new MyClass6(); 并不是原子操作，做了 3 件事
     * 1.给 instance 分配内存
     * 2.调用 Singleton 的构造函数来初始化成员变量
     * 3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）。
     * 但是 JVM 有重排序的机制，1-2-3，也可能 1-3-2，如果是后者，在 instance 变成非 null 时
     * 如果第二个线程开始第一个检验 if (instance == null)，那么便会直接返回 instance
     *
     * 因此这里添加 volatile 关键字是为了禁止指令重排序优化（Java 5 之后的特性）
     */
    private volatile static MyClass6 myClass;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass6() {
    }


    /**
     * 双重检验锁
     */
    public static MyClass6 getInstance() {
        if (myClass == null) {
            synchronized (MyClass6.class) {
                if (myClass == null) {
                    myClass = new MyClass6();
                }
            }
        }
        return myClass;
    }
}
