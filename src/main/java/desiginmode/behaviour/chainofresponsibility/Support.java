package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:49
 * @description
 */
public abstract class Support {
    /**
     * 解决问题的实例的名字
     */
    private String name;
    /**
     * 要推卸给的对象
     */
    private Support next;

    public Support(String name) { // 生成解决问题的实例
        super();
        this.name = name;
    }

    public Support setNext(Support next) { // 设置要推卸给的对象
        this.next = next;
        // 返回同一类型,可以进行链式调用
        return next;
    }

    @Override
    public String toString() { // 显示名字
        return "Support [name=" + name + "]";
    }

    protected abstract boolean resolve(Trouble trouble);// 是否有解决问题的方法

    protected void done(Trouble trouble) { // 解决问题
        System.out.println(trouble + "被" + this + "解决");
    }

    protected void fail(Trouble trouble) { // 解决问题失败
        System.out.println(trouble + "没有被" + this + "解决");
    }

    public final void support(Trouble trouble) { // 解决问题的步骤
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);

        } else {
            fail(trouble);
        }
    }
}
