package desiginmode.structural.proxy;

/**
 * @author Jay
 * @date 2019/6/29 23:47
 * @description
 */
public class ProxyTest {
    /**
     * 测试代理模式
     */
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        // 要调用主体生成方法,代理类完成不了,所以交给实际主体
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello, World.");
    }

}
