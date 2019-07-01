package desiginmode.behaviour.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Jay
 * @date 2019/6/23 20:35
 * @description 具体容器实现
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
