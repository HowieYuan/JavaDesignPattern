package strategy.model;

import strategy.weaponBehavior.BowAndArrowBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-21
 * @time 20:47
 */
public class Queen extends AbstractCharacter {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }

    @Override
    public void speak() {
        System.out.println("我是一位女王！");
    }
}
