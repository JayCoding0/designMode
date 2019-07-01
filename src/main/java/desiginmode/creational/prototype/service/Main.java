package desiginmode.creational.prototype.service;

import desiginmode.creational.prototype.framework.Manager;
import desiginmode.creational.prototype.framework.Product;

/**
 * @author Jay
 * @date 2019/6/3 23:11
 * @description
 */
public class Main {
    public static void main(String[] args) {
        //注册
        Manager m1 = new Manager();
        MessageBox m2 = new MessageBox('*');
        MessageBox m3 = new MessageBox('%');
        MessageBox m4 = new MessageBox('+');
        m1.register("星号", m2);
        m1.register("百分", m3);
        m1.register("加号", m4);
        //生成
        //父类接收,可以直接生成,不用通过new,也不需要中间复杂的生成实例过程
        Product p1 = m1.create("星号");
        p1.use("hello world");
    }
}
