package desiginmode.state;

/**
 * @author Jay
 * @date 2019/6/5 22:39
 * @description 满桶
 */
public class FullState implements DispenserState {
    @Override
    public void press() {
        System.out.println("Water is pouring!");

    }
}
