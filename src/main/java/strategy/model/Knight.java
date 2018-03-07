package strategy.model;

import strategy.weaponBehavior.KnifeBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 骑士
 * @date 2018-01-21
 * @time 20:48
 */
public class Knight extends AbstractCharacter {
    public Knight(){
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void speak() {
        System.out.println("我是一位骑士！");
    }
}
