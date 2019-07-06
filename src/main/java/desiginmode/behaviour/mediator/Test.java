package desiginmode.behaviour.mediator;

/**
 * @author Jay
 * @date 2019/7/6 19:13
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        //让两个具体同事类对象认识中介者对象
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.colleagueA = colleagueA;
        mediator.colleagueB = colleagueB;

        colleagueA.send("hi,nice to meet you!");
        colleagueB.send("nice to meet you too!");
    }
}
