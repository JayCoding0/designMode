package desiginmode.templatemethod;

/**
 * @author Jay
 * @date 2019/5/22 22:14
 * @description
 */
public class Main {
    public static void main(String[] args) {
        // 父类引用指向子类实现类对象.
        // 可以直接调用父类方法,不需要进行类型判断,里氏替换原则(LSP)
        AbstractDisplay d1 = new CharDisplay('A');
        AbstractDisplay d2 = new StringDisplay("Hello World");
        d1.display();
        System.out.println("\n==========================");
        d2.display();
    }
}
