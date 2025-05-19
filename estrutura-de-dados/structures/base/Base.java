package structures.base;

import java.util.List;

public class Base<T> {
    protected int size;
    protected T[] elements;

    public Base() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Base(int size) {
        this.elements = (T[]) new Object[size];
    }

    protected void add(T element) {
        increaseSize();

        this.elements[size++] = element;
    }

    protected void add(int index, T element) {
        increaseSize();

        for (int i = this.size; i >= index; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[index] = element;
        this.size++;
    }

    @SuppressWarnings("unchecked")
    protected void clear() {
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    protected boolean contains(T element) {
        return this.indexOf(element) > -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    protected T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size)
            throw new IndexOutOfBoundsException();

        return this.elements[index];
    }

    @SuppressWarnings("unchecked")
    protected List<T> getAll() {
        var listWithoutNullElements = (T[]) new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            listWithoutNullElements[i] = this.elements[i];
        }

        return List.of(listWithoutNullElements);
    }

    public int indexOf(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element))
                return i;
        }

        return -1;
    }

    protected int lastIndexOf(T element) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (element.equals(this.elements[i]))
                return i;
        }

        return -1;
    }

    protected void remove(int index) {
        for (int i = index; i <= this.size - 1; i++) {
            this.elements[index] = this.elements[++index];
        }

        this.size--;
    }

    protected void remove(T element) {
        if (this.contains(element))
            this.remove(this.indexOf(element));
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        var string = new StringBuilder();

        string.append("[");
        for (int i = 0; i < this.size - 1; i++) {
            string.append(this.elements[i]);
            string.append(", ");
        }

        if (this.size > 0)
            string.append(this.elements[this.size - 1]);

        return string.append("]").toString();
    }

    @SuppressWarnings("unchecked")
    protected void increaseSize() {
        if (this.elements.length == this.size) {
            T[] newArray = (T[]) new Object[(this.size * 3) / 2];

            for (int i = 0; i < this.elements.length; i++) {
                newArray[i] = this.elements[i];
            }

            this.elements = newArray;
        }
    }
}
