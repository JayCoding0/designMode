package desiginmode.templatemethod;

/**
 * @author Jay
 * @date 2019/5/22 22:13
 * @description
 */
public class
StringDisplay extends AbstractDisplay {
    private String ch;

    public StringDisplay(String ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("**");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println("**");
    }
}
