package desiginmode.builder.type1;

/**
 * @author Jay
 * @date 2019/6/25 22:41
 * @description 声明编写文档方法的抽象类
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
