package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:57
 * @description
 */
public class LimitSupport extends Support {
    /**
     * 解决编号小于limit的问题
     */
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) { //解决问题的方案.
        if (trouble.getNumber() < limit) {
            return true;
        }else {
            return false;
        }

    }
}
