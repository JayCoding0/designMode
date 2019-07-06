package desiginmode.behaviour.command;

/**
 * @author Jay
 * @date 2019/7/6 18:01
 * @description 频道切换命令
 */
public class CommandChange implements Command {
    private Tv myTv;

    int channel;

    CommandChange(Tv tv, int channel) {
        myTv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        myTv.changeChannel(channel);
    }
}
