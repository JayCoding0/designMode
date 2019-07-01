package desiginmode.creational.builder.type1;

/**
 * @author Jay
 * @date 2019/6/25 22:42
 * @description 使用Bulider中声明方法写文档
 */
public class Director {
    /**
     * 可将子类实例保存其中
     */
    private Builder builder;

    /**
     * 抽象类无法实例化对象,可以接收其子类实例.
     *
     * @param builder
     */
    public Director(Builder builder) {
        super();
        this.builder = builder;
    }

    /**
     * 编写文档
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早到下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好"
        });
        builder.makeString("晚上好");
        builder.makeItems(new String[]{
                "晚上好",
                "再见!"
        });
        builder.close();
    }

}
