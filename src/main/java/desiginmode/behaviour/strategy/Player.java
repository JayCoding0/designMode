package desiginmode.behaviour.strategy;

/**
 * @author Jay
 * @date 2019/7/6 21:44
 * @description
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) { // 赋予姓名和策略
        super();
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        //调用接口的静态获取方法,也就是说,将本类要来生成的实例,委托给接口去实现,这种弱关联关系即为委托关系
        //接口可以调用其具体的实现类,从而返回不同的具体实例,方便整体的替换,降低程序的耦合性.
        return strategy.nextHand(); // 策略决定下一局要出的手势,接口类型,不论以后算法如何修改对于此类没有影响

    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

    public String toString() {
        return "[" + name + ":" + gamecount + "  局游戏  " + wincount + " 胜  " + losecount + " 负 " + "]";
    }
}
