package desiginmode.templatemethod;

/**
 * @author Jay
 * @date 2019/5/22 21:54
 * @description 父类为抽象类, 规定抽象方法以及业务处理流程
 */
public abstract class AbstractDisplay {

    /**
     * 抽象方法
     */
    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 抽象类中允许非抽象方法,规定业务处理流程,同时
     * 该方法用final修饰,子类无法重写,故只能按照其父类规定来执行
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }


}
