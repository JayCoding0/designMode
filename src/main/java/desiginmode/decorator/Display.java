package desiginmode.decorator;

/**
 * @author Jay
 * @date 2019/6/24 22:33
 * @description 抽象父类, 定义规范
 */
public abstract class Display {
    /**
     * 获取横向字符
     *
     * @return
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     *
     * @return
     */
    public abstract int getRows();

    /**
     * 获取第row行的字符串
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);

    /**
     * final修饰,子类无法重构写,父类定义展示规范.所以装饰者必须去
     * 修改从接口实现的相同方法,即必须遵循父类中的规范,才会真正的装饰起作用.!
     */
    public final void show() {

        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
