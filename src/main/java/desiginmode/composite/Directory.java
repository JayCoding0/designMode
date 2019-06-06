package desiginmode.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jay
 * @date 2019/6/6 23:15
 * @description 文件夹类
 */
public class Directory extends Entry {
    private String name;

    /**
     * 只有文件夹才是数组结构,文件只是其中的元素,所以类型为directory
     * 而其中元素可以是文件,也可以是文件夹,所以泛型为父类泛型
     * 多个数组的套嵌结构,形成了文件树的结构形式.
     */
    private ArrayList<Entry> directory = new ArrayList<Entry>();

    public Directory(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() { // 获取大小
        int size = 0;
        Iterator it = directory.iterator();

        while (it.hasNext()) {

            Entry entry = (Entry) it.next();
            // 获取长度
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 重写了父类的添加方法.
     */
    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) { // 目录条目一览
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            // 递归调用,父类接收,判断向下转型,调用各自对应方法.
            entry.printList(prefix + "/" + name);
        }
    }
}
