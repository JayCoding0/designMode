package desiginmode.creational.factorymethod;

import desiginmode.creational.factorymethod.framework.Factory;
import desiginmode.creational.factorymethod.framework.Product;
import desiginmode.creational.factorymethod.idcard.IDCardFactory;

/**
 * @author Jay
 * @date 2019/5/21 22:38
 * @description 测试类
 */
public class Main {
    public static void main(String[] args) {

        // 父类接收子类实例,可以直接调用父类方法,里氏替换.
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");
        // IDCardFactory idCardFactory = new IDCardFactory();
        // idCardFactory.create("赵六"); 由于方法为类访问权限,所以外界无法直接调用
        // 只能用父类去接收,调用父类create方法,然后从内部自动调用.
        card1.use();
        card2.use();
    }
}
