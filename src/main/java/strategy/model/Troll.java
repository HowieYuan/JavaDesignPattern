package strategy.model;

import strategy.weaponBehavior.AxeBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 洞穴巨人
 * @date 2018-01-21
 * @time 20:47
 */
public class Troll extends AbstractCharacter {
    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    public void speak() {
        System.out.println("我是一位洞穴巨人！");
    }
}
