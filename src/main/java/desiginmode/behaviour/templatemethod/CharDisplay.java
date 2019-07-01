package desiginmode.behaviour.templatemethod;

/**
 * @author Jay
 * @date 2019/5/22 22:09
 * @description
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        super();
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");

    }

    @Override
    public void print() {

        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.print(">>");
    }
}
