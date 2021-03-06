package desiginmode.behaviour.interpreter;

/**
 * @author Jay
 * @date 2019/7/5 23:04
 * @description 命令节点类
 * <command> ::= <repeat command> | <primitive command>
 */
public class CommandNode extends Node {
    /**
     * 节点
     */
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if (context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
