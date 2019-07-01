package desiginmode.structural.decorator;

/**
 * @author Jay
 * @date 2019/6/24 22:52
 * @description
 */
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    /**
     * 字符数为字符串字符数加上俩测边框字符数
     *
     * @return
     */
    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    /**
     * 对方法加强,加以修饰,加上俩侧边框
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
