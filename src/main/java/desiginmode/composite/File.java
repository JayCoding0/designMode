package desiginmode.composite;

/**
 * @author Jay
 * @date 2019/6/6 23:15
 * @description 普通文件类
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        super();
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
