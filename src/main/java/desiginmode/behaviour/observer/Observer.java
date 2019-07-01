package desiginmode.behaviour.observer;

/**
 * @author Jay
 * @date 2019/6/22 21:41
 * @description 观察者对象
 */
public interface Observer {
    /**
     * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
     *
     * @param message
     */
    void update(String message);
}
