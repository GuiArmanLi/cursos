import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static int search(List<Integer> list, int element) {
        if (list.isEmpty())
            return -1;

        int middle = list.size() / 2;
        var middleElement = list.get(middle);
        if (middleElement == element) {
            return element;
        }

        if (element < middleElement) {
            return search(list.subList(0, middle), element);
        }

        return search(list.subList(middle, list.size()), element);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(BinarySearch.search(list, 10));
    }
}
