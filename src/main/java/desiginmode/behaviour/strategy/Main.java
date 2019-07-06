package desiginmode.behaviour.strategy;

/**
 * @author Jay
 * @date 2019/7/6 21:45
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("张三", new WinningStrategy());//不同的策略更换对于程序没有影响
        Player p2 = new Player("李四", new ProbStrategy());
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("Winner:" + p1);
                p1.win();
                p2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner:" + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("平局...");
                p1.even();
                p2.even();
            }
        }
    }
}
