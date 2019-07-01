package desiginmode.creational.prototype.service;

import desiginmode.creational.prototype.framework.Product;

/**
 * @author Jay
 * @date 2019/6/3 22:58
 * @description 具体实例创建的过程
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        System.out.println(decochar + s + decochar);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            //只有继承了复制接口的类才可以调用此方法复制自己,将本实例n全部复制到
            //新的实例当中.
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
