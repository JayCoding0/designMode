package desiginmode.behaviour.visitor;



/**
 * @author Jay
 * @date 2019/7/6 21:13
 * @description
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
