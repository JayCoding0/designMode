package desiginmode.structural.adapter.entrust;

import desiginmode.structural.adapter.Banner;

/**
 * @author Jay
 * @date 2019/5/23 23:13
 * @description
 */
public class PrintBanner extends Print {
    /**
     * 使用组合将俩个类方法都可以调用
     */
    private Banner banner;

    public PrintBanner(String string) {
        // 构造函数创建Banner对象
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
