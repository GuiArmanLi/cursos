package structures.stack;

import structures.base.Base;

public class Stack<T> extends Base<T> {
    public Stack() {
        super();
    }

    public Stack(int size) {
        super(size);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public T peek() {
        if (!super.isEmpty())
            return super.get(super.size - 1);

        return null;
    }

    public T pop() {
        var element = this.peek();
        if (element != null)
            super.remove(size() - 1);
        return element;
    }

    public void push(T element) {
        super.add(element);
    }

    public int search(T element) {
        return super.indexOf(element);
    }
}
