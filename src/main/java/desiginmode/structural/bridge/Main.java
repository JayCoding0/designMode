package desiginmode.structural.bridge;

/**
 * @author Jay
 * @date 2019/6/4 23:03
 * @description
 */
public class Main {
    public static void main(String[] args) {
        //接收类型为接口类型,其实现类全部可以使用
        Display d1 = new Display(new StringDisplayImp("hello china"));
        //父类功能
        d1.display();
        System.out.println("************************");
        //子类掉用的父类功能
        Display d2 = new CountDisplay(new StringDisplayImp("hello world"));
        d2.display();
        System.out.println("************************");
        //子类独有功能
        CountDisplay d3 = new CountDisplay(new StringDisplayImp("hello miss"));
        d3.multiDisplay(2);
    }
}
