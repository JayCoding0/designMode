package desiginmode.behaviour.strategy;

/**
 * @author Jay
 * @date 2019/7/6 21:43
 * @description
 */
public interface Strategy {
    void study(boolean win);
    Hand nextHand();
}
