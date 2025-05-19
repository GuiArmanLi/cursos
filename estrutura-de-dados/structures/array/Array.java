package structures.array;

import structures.base.Base;

import java.util.List;

public class Array<T> extends Base<T> {
    public Array() {
        super(10);
    }

    public Array(int size) {
        super(size);
    }

    @Override
    public void add(T element) {
        super.add(element);
    }

    @Override
    public void add(int index, T element) {
        super.add(index, element);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public boolean contains(T element) {
        return super.contains(element);
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        return super.get(index);
    }

    @Override
    public List<T> getAll() {
        return super.getAll();
    }

    @Override
    public int lastIndexOf(T element) {
        return super.lastIndexOf(element);
    }

    public void removeByIndex(int index) {
        super.remove(index);
    }

    @Override
    public void remove(T element) {
        super.remove(element);
    }
}