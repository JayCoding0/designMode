package desiginmode.behaviour.state;

/**
 * @author Jay
 * @date 2019/6/5 22:49
 * @description
 */
public class Test {
    public static void main(String[] args) {
        WaterDispenser dispenser = new WaterDispenser(new FullState());
        for (int i = 0; i < 100; ++i) {
            dispenser.press();
        }
    }
}
