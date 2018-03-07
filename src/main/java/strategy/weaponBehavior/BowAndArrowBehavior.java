package strategy.weaponBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 弓箭
 * @date 2018-01-21
 * @time 20:50
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("弓箭攻击！");
    }
}