package structures.queue;

import structures.base.Base;

public class Queue<T> extends Base<T> {
    public void add(T element) {
        super.add(element);
    }

    public T peek() {
        return super.get(0);
    }

    public T pool() {
        var element = this.peek();
        if (element != null)
            super.remove(0);

        return element;
    }

    public void remove() {
        super.remove(0);
    }
}