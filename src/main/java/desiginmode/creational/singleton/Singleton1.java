package desiginmode.creational.singleton;

/**
 * @author Jay
 * @date 2019/5/16 23:12
 * @description 单例模式--饿汉模式
 */
public class Singleton1 {
    /**
     * 静态属性,每次类加载时都被创建
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * 私有方法外界无法调用,所以也无法创建对象
     */
    private Singleton1() {
    }

    /**
     * 对外只能通过静态方法调用唯一的实例,从而保证实例的唯一性.
     */
    public static Singleton1 getInstance() {
        return instance;
    }

}
