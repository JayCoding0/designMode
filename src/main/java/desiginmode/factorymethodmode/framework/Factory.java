package desiginmode.factorymethodmode.framework;

/**
 * @author Jay
 * @date 2019/5/21 22:14
 * @description 工厂抽象类
 */
public abstract class Factory {
    /**
     * 用到模板设计模式
     * final修饰生成对象,无法被子类继承,其中规定了生成实例方式.
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * 注册产品方法
     *
     * @param p
     */
    public abstract void registerProduct(Product p);

    /**
     * 创建产品方法
     *
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

}



