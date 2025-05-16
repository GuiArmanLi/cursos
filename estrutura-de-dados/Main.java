import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var list = new ArrayList<String>();
        var array = new Array<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");

        list.remove(2);
        array.remove(2);

        System.out.println(list);
        System.out.println(array);

        System.out.println(array.get(1));
        System.out.println(array.get(1));
        System.out.println(array.get(1));
    }

}