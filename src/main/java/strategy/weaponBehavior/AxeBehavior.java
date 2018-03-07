package strategy.weaponBehavior;

/**
 * Created with IntelliJ IDEA
 *
 * @author yuanhaoyue swithaoy@gmail.com
 * @description 斧头
 * @date 2018-01-21
 * @time 20:49
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("斧头攻击！");
    }
}
