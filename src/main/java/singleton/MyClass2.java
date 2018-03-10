package singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description
 * @Date 2018-03-10
 * @Time 22:49
 */
public class MyClass2 {
    /**
     * 急切创建
     */
    private static MyClass2 myClass2 = new MyClass2();

    private MyClass2() {
    }

    public static MyClass2 getInstance() {
        return myClass2;
    }
}
