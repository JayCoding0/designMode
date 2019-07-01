package desiginmode.structural.adapter;

/**
 * @author Jay
 * @date 2019/5/23 22:52
 * @description
 */
public class Banner {
    private String string;

    public Banner(String string) {
        super();
        this.string = string;
    }

    /**
     * 括号方式
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");

    }

    /**
     * 星号方式
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
