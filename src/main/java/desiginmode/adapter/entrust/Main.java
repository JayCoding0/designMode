package desiginmode.adapter.entrust;

/**
 * @author Jay
 * @date 2019/5/23 23:14
 * @description
 */
public class Main {
    /**
     * 测试类
     */
    public static void main(String[] args) {
        //接口引用接收其实现类对象
        Print p = new PrintBanner("Hello");
        //只能调用从接口实现的方法以及子类自己的方法,无法调用父类.
        p.printStrong();
        p.printWeak();
    }
}
