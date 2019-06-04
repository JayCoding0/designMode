package desiginmode.bridge;

/**
 * @author Jay
 * @date 2019/6/4 23:01
 * @description
 */
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl imp) {
        super(imp);
    }

    /**
     * 增加的功能
     *
     * @param times
     */
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
