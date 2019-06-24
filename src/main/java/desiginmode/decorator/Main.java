package desiginmode.decorator;

/**
 * @author Jay
 * @date 2019/6/24 22:59
 * @description
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World!");
        d1.show();
        Display d2 = new SideBorder(d1, '#');
        d2.show();
        Display d3 = new FullBorder(d1);
        d3.show();
        //由于装设者类也实现了此接口,所以可以将装设者类传入构造函数当作原型进一步装饰.
        Display d4 = new SideBorder(new SideBorder(new FullBorder(new StringDisplay("Hello World!")),'&'), '*');
        d4.show();

    }
}
