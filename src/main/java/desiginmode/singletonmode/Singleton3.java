package desiginmode.singletonmode;

/**
 * @author Jay
 * @date 2019/5/16 23:20
 * @description 线程安全的懒汉模式
 */
public class Singleton3 {
    /**
     * 静态代码区不会创建对象
     */
    private static Singleton3 instance;
    //private ThreadLocal threadLocal = new ThreadLocal();

    private Singleton3() {
    }

    /**
     * 通过静态方法必须自己手动获取.
     *
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            return instance = new Singleton3();
        }

        return instance;
    }

    //    public Singleton3 getInstance() {
    //        if (instance == null) {
    //            instance = new Singleton3();
    //
    //            threadLocal.set(instance);
    //            return instance;
    //        }
    //
    //        return (Singleton3) threadLocal.get();
    //    }

}