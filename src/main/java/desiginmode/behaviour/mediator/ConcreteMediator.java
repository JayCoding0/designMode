package desiginmode.behaviour.mediator;

/**
 * @author Jay
 * @date 2019/7/6 19:07
 * @description
 */
public class ConcreteMediator extends Mediator {
    ConcreteColleagueA colleagueA;
    ConcreteColleagueB colleagueB;


    /**
     * 重写发送消息的方法，根据具体发送消息的对象去通知接收消息的对象
     *
     * @param message
     * @param colleague
     */
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notify(message);
        } else {
            colleagueA.notify(message);
        }

    }
}
