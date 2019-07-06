package desiginmode.behaviour.mediator;

/**
 * @author Jay
 * @date 2019/7/6 19:06
 * @description
 */
public abstract class Colleague {
    protected Mediator mediator;

    /**
     * 构造方法，得到中介者对象
     */
    public Colleague() {
        this.mediator = mediator;
    }
}
