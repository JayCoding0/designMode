package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:59
 * @description
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);

    }

    @Override
    protected boolean resolve(Trouble trouble) {// 解决问题的方案
        if (trouble.getNumber() % 2 == 1) {
            return true;

        }
        return false;
    }
}
