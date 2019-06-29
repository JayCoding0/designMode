package desiginmode.proxy;

/**
 * @author Jay
 * @date 2019/6/29 23:40
 * @description 打印接口
 */
public interface Printable {

    /**
     * 设置名字
     *
     * @param name 名字
     */
    void setPrinterName(String name);

    /**
     * 获取名字
     *
     * @return 名字
     */
    String getPrinterName();

    /**
     * 显示文字
     *
     * @param string 文字
     */
    void print(String string);
}


