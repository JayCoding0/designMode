package desiginmode.behaviour.chainofresponsibility;

/**
 * @author Jay
 * @date 2019/7/6 19:44
 * @description
 */
public class Trouble {
    /**
     * 问题编号
     */
    private int number;

    public Trouble(int number) { // 生成问题
        this.number = number;
    }

    public int getNumber() { // 获取问题编号
        return number;
    }

    @Override
    public String toString() { // 代表问题的字符串
        return "Trouble [number=" + number + "]";
    }

}
