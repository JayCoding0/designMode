package desiginmode.behaviour.command;

/**
 * @author Jay
 * @date 2019/7/6 18:00
 * @description 关机命令
 */
public class CommandOff implements Command {
    private Tv myTv;


    public CommandOff(Tv tv) {
        myTv = tv;
    }

    @Override
    public void execute() {
        myTv.turnOff();
    }
}
