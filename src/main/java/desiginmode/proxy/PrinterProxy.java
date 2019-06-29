package desiginmode.proxy;

/**
 * @author Jay
 * @date 2019/6/29 23:46
 * @description 代理打印类
 */
public class PrinterProxy implements Printable {
    /**
     * 名字
     */
    private String name;
    /**
     * 本人
     */
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (this.real != null) {
            this.real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        this.realize();
        this.real.print(string);
    }

    /**
     * 生成本人
     */
    private synchronized void realize() {
        if (this.real == null) {
            this.real = new Printer(this.name);
        }
    }
}
