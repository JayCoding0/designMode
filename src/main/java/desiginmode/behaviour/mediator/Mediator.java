package desiginmode.behaviour.mediator;

/**
 * @author Jay
 * @date 2019/7/6 19:05
 * @description 中介者
 */
public abstract class Mediator {

    /**
     * 定义一个抽象的发送消息方法
     * 功能：得到同事对象和发送消息
     *
     * @param message
     * @param colleague
     */
    public abstract void send(String message, Colleague colleague);
}
