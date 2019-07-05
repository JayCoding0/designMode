package desiginmode.behaviour.interpreter;

/**
 * @author Jay
 * @date 2019/7/5 23:05
 * @description 原始命令节点类
 */
public class PrimitiveCommandNode extends Node {
    /**
     * 名字
     */
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
