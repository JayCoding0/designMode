package desiginmode.behaviour.interpreter;

/**
 * @author Jay
 * @date 2019/7/5 23:02
 * @description 程序节点类
 * <program> ::= program <command list>
 */
public class ProgramNode extends Node {
    /**
     * 命令列表节点
     */
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
