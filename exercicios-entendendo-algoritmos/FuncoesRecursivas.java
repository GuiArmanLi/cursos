import java.util.List;

public class FuncoesRecursivas {
    public static int soma(List<Integer> lista) {
        if (lista.isEmpty())
            return 0;

        return lista.remove(0) + soma(lista);
    }

    public static int contaItens(List<Integer> lista) {
        if (lista.isEmpty())
            return 0;

        return 1 + contaItens(lista.subList(1, lista.size()));
    }

    public static int valorMaximo(List<Integer> lista) {
        if (contaItens(lista) < 1) {
            return 0;
        } else if (contaItens(lista) == 1) {
            return lista.get(0);
        } else {
            if (lista.get(lista.size() - 1) > lista.get(0)) {
                lista.remove(0);
                return valorMaximo(lista);
            }
        }
        lista.remove(lista.size() - 1);

        return valorMaximo(lista);
    }
}
