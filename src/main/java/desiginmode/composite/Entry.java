package desiginmode.composite;

/**
 * @author Jay
 * @date 2019/6/6 23:11
 * @description
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    /**
     * 子类去调用此方法时会抛出异常,父类也可以不规定此方法,文件夹类独有方法,又构成组合关系。
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();

    }

    /**
     * 重载方法,这样可以区别出第一次,也可以不必在父类中写,子类中自己判断输出结构。
     */
    public void printList() {
        // 显示条目
        printList("");
    }

    /**
     * 为一览加前缀
     * @param prefix
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

}