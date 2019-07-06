package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:56
 * @description
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);

    }

    @Override
    protected boolean resolve(Trouble trouble) {  //解决问题的处理方法
        //  自己不做处理,是一个永远不解决问题的类.
        return false;
    }
}
