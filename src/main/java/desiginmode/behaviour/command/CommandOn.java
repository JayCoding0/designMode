package desiginmode.behaviour.command;

/**
 * @author Jay
 * @date 2019/7/6 17:59
 * @description 开机命令
 */
public class CommandOn implements Command {
    private Tv myTv;

    public CommandOn(Tv tv) {
        myTv = tv;
    }

    @Override
    public void execute() {
        myTv.turnOn();
    }
}
