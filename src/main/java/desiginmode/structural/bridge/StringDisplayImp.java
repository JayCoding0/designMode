package desiginmode.structural.bridge;

/**
 * @author Jay
 * @date 2019/6/4 23:02
 * @description 具体实现其中的方法.
 */
public class StringDisplayImp extends DisplayImpl {

    private String string;
    private int width;

    public StringDisplayImp(String string) {
        super();
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
