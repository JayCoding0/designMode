package desiginmode.creational.builder.type1;



/**
 * @author Jay
 * @date 2019/6/25 22:51
 * @description
 */
public class Main {
    public static void main(String[] args) {
        //实例化组件对象
        TextBuilder tb =  new TextBuilder();
        //将其作为参数传递进去,组装方法调用组件对象的具体组件去组装
        Director di = new Director(tb);
        //调用组装方法
        di.construct();
        System.out.println(tb.getResult());

    }
}
