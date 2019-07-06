package desiginmode.behaviour.mediator;

/**
 * @author Jay
 * @date 2019/7/6 19:13
 * @description
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        //消息是通过中介者发送出去的
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("B同事收到消息：" + message);
    }
}
