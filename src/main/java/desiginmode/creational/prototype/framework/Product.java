package desiginmode.creational.prototype.framework;

/**
 * @author Jay
 * @date 2019/6/3 22:36
 * @description 继承复制接口，定义抽象方法
 */
public interface Product extends Cloneable {
    /**
     * 使用方法
     *
     * @param s
     */
    void use(String s);


    /**
     * 定义生成实例的方法
     *
     * @return
     */
    Product createClone();

}
