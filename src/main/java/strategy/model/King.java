package strategy.model;

import strategy.weaponBehavior.SwordBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-21
 * @time 20:47
 */
public class King extends AbstractCharacter {
    public King() {
        setWeapon(new SwordBehavior());
    }

    @Override
    public void speak() {
        System.out.println("我是一位持剑君王！");
    }
}
