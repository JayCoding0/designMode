package desiginmode.structural.decorator;

/**
 * @author Jay
 * @date 2019/6/24 22:37
 * @description 实现父类抽象方法, 具体实现, 要被装饰的原型类, 与装饰着实现同一接口.
 */
public class StringDisplay extends Display {
    /**
     * 要显示的字符串
     */
    private String string;


    /**
     * 从外界传入要显示的字符串
     *
     * @param string
     */
    public StringDisplay(String string) {
        super();
        this.string = string;
    }

    @Override
    public int getColumns() {
        // 传入的字符数
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        // 单行显示只有一行
        return 1;
    }

    /**
     * 当为0时返回,第0行行返回,因为只有一行.
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
