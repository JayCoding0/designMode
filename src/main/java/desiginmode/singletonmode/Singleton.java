package desiginmode.singletonmode;

/**
 * @author Jay
 * @date 2019/5/16 23:28
 * @description 静态内部类
 */


public class Singleton {
    /**
     * 私有构造方法,外界无法调用
     */
    private Singleton() {
    }

    private static class Inner {
        /**
         * 内部类调用其构造方法创建实例,内部类一旦加载
         * 就只有唯一实例,所以线程安全.
         */
        private static Singleton instanceHolder = new Singleton();

    }

    /**
     * 提供公有的方法去调用内部类创建的对象
     *
     * @return
     */
    public static Singleton getInstacen() {
        return Inner.instanceHolder;
    }
}

