package factory.simpleFactory;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-02-02
 * @time 22:04
 */
public abstract class Pizza {
    /**
     * 披萨名
     */
    private String name;
    /**
     * 酱汁
     */
    private String sauce;

    public abstract void finish();

    public void prepare() {
        System.out.println("开始准备" + name);
        System.out.println("添加" + sauce);
    }

    public void cut() {
        System.out.println("将" + name +"切成 8 份");
    }

    public void box() {
        System.out.println("将" + name + "装入纸盒");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }
}
