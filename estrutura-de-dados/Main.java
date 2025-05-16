import estruturas.Array;
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
        System.out.println(list);
        System.out.println(array);

        System.out.println("Adicionar String '10' no index 0");
        array.add(0, "10");
        list.add(0, "10");
        System.out.println(list);
        System.out.println(array);

        System.out.println("Remove elemento do index 0");
        array.remove(0);
        list.remove(0);
        System.out.println(list);
        System.out.println(array);

        System.out.println("Remove elemento '2'");
        list.remove("2");
        array.remove("2");
        System.out.println(list);
        System.out.println(array);

        System.out.println("Elemento no index 1 do array: " + array.get(1));
        System.out.println("Elemento no index 1 do list: " + list.get(1));

        System.out.println("Index do elemento '3' do array: " + array.getIndex("3"));
        System.out.println("Tamanho do array: " + array.size());

        System.out.println("array tem o valor '4'? " + array.contains("4"));
        System.out.println("array tem o valor '7'? " + array.contains("7"));

        System.out.println("Ultimo index do array: " + array.lastIndexOf());

        list.clear();
        array.clear();
        System.out.println("list após ser limpa: " + list);
        System.out.println("array após ser limpa: " + list);

        var contatos = new Array<Contato>(20);

        for (int i = 0; i < 30; i++) {
            contatos.add(new Contato("Numero" + (i + 1), "" + (i + 1), "email" + (i + 1)));
        }

        var contato = new Contato("Teste", "1234", "test@gmail.com");
        System.out.println(contatos.contains(contato));
        System.out.println(contatos.get(5));
        System.out.println(contatos.getIndex(contato));
        System.out.println(contatos.isEmpty());
        System.out.println(contatos.lastIndexOf());
        System.out.println(contatos.size());
        contatos.clear();
        contatos.add(contato);
        contatos.add(contato);
        System.out.println(contatos);

        var lista = new ArrayList<Contato>();
        for (Contato c : contatos.getAll()) {
            lista.add(c);
        }

        System.out.println(contatos.contains(contato));
        System.out.println(lista.get(1));
        System.out.println(lista.indexOf(contato));
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        lista.clear();
        lista.add(contato);
        lista.add(contato);
        System.out.println(lista);
    }

}