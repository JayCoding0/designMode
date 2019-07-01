package desiginmode.structural.decorator;

/**
 * @author Jay
 * @date 2019/6/24 22:45
 * @description 边框类, 用来装饰其他类的必须要与被装饰类又同样的父类或者实现同样的接口,
 * 才能去装饰其中共同的方法.
 */
public abstract class Border extends Display {
    /**
     * 表示被装饰物,接口类型,表示只要实现同一接口即可去装饰
     */
    protected Display display;

    /**
     * 生成实例时通过参数指定被装饰物,也就是说将被装饰者传入装饰者对象去处理.
     *
     * @param display
     */
    public Border(Display display) {
        super();
        this.display = display;
    }

}
