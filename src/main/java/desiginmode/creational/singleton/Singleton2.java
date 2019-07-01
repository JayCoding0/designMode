package desiginmode.creational.singleton;

/**
 * @author Jay
 * @date 2019/5/16 23:16
 * @description 懒汉模式
 */
public class Singleton2 {
    /**
     * 静态代码区不会创建对象
     */
    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 通过静态方法必须自己手动获取.
     *
     * @return
     */
    public static Singleton2 getInstance() {
        if (instance == null) {
            return instance = new Singleton2();
        }
        return instance;
    }
}
