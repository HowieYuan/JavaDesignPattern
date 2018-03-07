package strategy;

import strategy.model.King;
import strategy.weaponBehavior.AxeBehavior;
import strategy.weaponBehavior.BowAndArrowBehavior;
import strategy.weaponBehavior.KnifeBehavior;
import strategy.weaponBehavior.SwordBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description
 * @date 2018-01-21
 * @time 21:10
 */
public class Test {
    public static void main(String[] args) {
        King king = new King();
        king.speak();
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
    }
}
