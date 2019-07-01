package desiginmode.structural.adapter;

/**
 * @author Jay
 * @date 2019/5/23 22:55
 * @description 适配器,实现接口又继承类,可以使用俩者的方法.
 */
public class PrintBanner extends Banner implements Print {
    /**
     * 适配器对象
     */
    public PrintBanner(String string) {
        super(string);
        // 父类只有一个构造器则子类只能调用父类唯一构造器
        // 需把值传入
    }

    @Override
    public void printWeak() {
        //有个隐式的super可以调用父类方法
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
