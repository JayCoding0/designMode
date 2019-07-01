package desiginmode.behaviour.observer;


/**
 * @author Jay
 * @date 2019/6/22 21:36
 * @description 抽象被观察者接口, 声明了添加、删除、通知观察者方法。
 */
public interface Observerable {
    /**
     * 添加观察者
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
