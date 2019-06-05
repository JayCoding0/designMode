package desiginmode.state;

/**
 * @author Jay
 * @date 2019/6/5 22:41
 * @description 实现饮水机
 */
public class WaterDispenser {
    private static int capacity = 20;
    private static DispenserState dispenserState;

    public WaterDispenser(DispenserState state) {
        dispenserState = state;
    }

    private static void setState(DispenserState state) {
        dispenserState = state;
    }

    public DispenserState getState() {
        return dispenserState;
    }

    public void press() {
        capacity--;
        if (capacity <= 0) {
            // 只需要改变状态即可
            setState(new NullState());
        }
        dispenserState.press();
    }
}
