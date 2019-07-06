package desiginmode.behaviour.strategy;

import java.util.Random;

/**
 * @author Jay
 * @date 2019/7/6 21:43
 * @description
 */
public class WinningStrategy implements  Strategy {
    private Random random;
    private boolean won = false;
    private Hand preHand;
    public WinningStrategy() {
        random = new Random();
    }
    @Override
    public Hand nextHand() {

        if(!won) {
            preHand =Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }
    @Override
    public void study(boolean win) {
        won =win;
    }
}
