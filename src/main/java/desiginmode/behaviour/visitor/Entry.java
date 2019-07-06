package desiginmode.behaviour.visitor;

import desiginmode.structural.composite.FileTreatmentException;

/**
 * @author Jay
 * @date 2019/7/6 21:15
 * @description
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    /**
     * 子类去调用此方法时会抛出异常,父类也可以不规定此方法,文件夹类独有方法,又构成组合关系.
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();

    }

    public void printList() { //重载方法,这样可以区别出第一次,也可以不必在父类中写,子类中自己判断输出结构.
        // 显示条目
        printList("");
    }

    protected abstract void printList(String prefix); // 为一览加前缀

    protected abstract void accept(Visitor v);

    @Override
    public String toString() {

        return getName() + "(" + getSize() + ")";
    }
}
