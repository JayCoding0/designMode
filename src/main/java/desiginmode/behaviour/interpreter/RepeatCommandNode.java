package desiginmode.behaviour.interpreter;

/**
 * @author Jay
 * @date 2019/7/5 23:04
 * @description     命令节点类
 */
public class RepeatCommandNode extends Node {
    /**
     * 重复次数
     */
    private int number;
    /**
     * 命令列表节点
     */
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
