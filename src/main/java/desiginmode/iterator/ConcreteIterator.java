package desiginmode.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jay
 * @date 2019/6/23 20:32
 * @description 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator() {

    }

    public ConcreteIterator(List<T> list) {
        this.list = list;

    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Object next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
