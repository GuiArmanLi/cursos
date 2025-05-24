import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(10);

        System.out.println(FuncoesRecursivas.valorMaximo(lista));
        System.out.println(FuncoesRecursivas.contaItens(lista));
        System.out.println(FuncoesRecursivas.soma(lista));
    }
}
