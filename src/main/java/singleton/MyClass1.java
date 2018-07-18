package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 懒汉式-线程不安全
 * @Date 2018-03-10
 * @Time 21:44
 */
public class MyClass1 {
    /**
     * 静态变量，确保 MyClass1 类是唯一实例
     */
    private static MyClass1 myClass;

    /**
     * 私有的构造器方法，确保其他类无法直接通过 new 来实例化
     */
    private MyClass1() {
    }

    /**
     * 请求实例，实现“延迟实例化”，如果我们不需要这个实例，它就永远不会产生
     */
    public static MyClass1 getInstance() {
        //只有当 myClass1 为空时才实例化
        if (myClass == null) {
            myClass = new MyClass1();
        }
        return myClass;
    }
}
