package desiginmode.behaviour.state;

/**
 * @author Jay
 * @date 2019/6/5 22:40
 * @description 空桶
 */
public class NullState implements  DispenserState {
    @Override
    public void press() {
        System.out.println("There is not water poured!");
    }
}
