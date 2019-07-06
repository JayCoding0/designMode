package desiginmode.behaviour.visitor;

/**
 * @author Jay
 * @date 2019/7/6 21:14
 * @description 接口接收访问者
 */
public interface Element {
    void accept(Visitor v);
}
