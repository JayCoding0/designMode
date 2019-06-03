package desiginmode.prototype.framework;

import java.util.HashMap;

/**
 * @author Jay
 * @date 2019/6/3 22:47
 * @description 定义注册的规范
 */
public class Manager {
    /**
     * 通过map实现一个实例池,每次调用注册方法都可以将实例放入,保证了不重复
     */
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * 定义获取实例流程,通过接口制定规范,可以接受其全部实现类对象.
     *
     * @param protoname
     * @return
     */
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        //调用复制方法,复制一个新的实例
        return p.createClone();
    }

}
