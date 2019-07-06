package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:59
 * @description
 */
public class SpecialSupport extends  Support {
    /**
     * 解决指定编号的问题
     */
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) { // 解决问题的方法
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
