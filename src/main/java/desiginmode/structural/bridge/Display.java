package desiginmode.structural.bridge;

/**
 * @author Jay
 * @date 2019/6/4 22:59
 * @description
 */
public class Display {
    /**
     * 桥梁作用
     */
    private DisplayImpl imp;

    public Display(DisplayImpl imp) {
        super();
        this.imp = imp;
    }

    public void open() {
        imp.rawOpen();
    }

    public void print() {
        imp.rawPrint();
    }

    public void close() {
        imp.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
