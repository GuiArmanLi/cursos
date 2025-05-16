
import java.util.Arrays;

public class Array<T> {
    private int size;
    private T[] elements;

    public Array() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Array(int size) {
        this.elements = (T[]) new Object[size];
    }

    public void add(T element) {
        increaseSize();

        this.elements[size++] = element;
    }

    public void add(int index, T element) {
        increaseSize();

        for (int i = this.size; i >= index; i--) {
            this.elements[this.size - 1] = this.elements[this.size];
        }

        this.elements[index] = element;
        this.size++;
    }

    public T get(int index) {
        if (index < 0 || index > this.size)
            throw new IndexOutOfBoundsException();

        return this.elements[index];
    }

    public int getIndex(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (this.elements[i].equals(element))
                return i;
        }

        return -1;
    }

    public void remove(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.elements[index] = this.elements[++index];
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elements);
    }

    @SuppressWarnings("unchecked")
    private void increaseSize() {
        if (!(this.elements.length == this.size))
            return;

        T[] newArray = (T[]) new Object[(this.size * 3) / 2];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.elements[i];
        }

        this.elements = newArray;
    }

}