
public class App {

    public static void main(String[] args) throws Exception {

        System.out.printf("""
        O resultado é: %s
        O resultado é: %s
        O resultado é: %s
        O resultado é: %s
        """,
                Operadores.adicao(10, 5),
                Operadores.subtracao(10, 5),
                Operadores.multiplicacao(10, 5),
                Operadores.divisao(10, 5));

        var valor = true;
        System.out.printf("""
        Número incrementado é: %s
        Número decrementado é: %s
        Número diferente de zero? %s
        Número igual de zero? %s
        Número maior que zero? %s
        Número menor que zero? %s
        Inverso de %s é %s
        """,
                Operadores.incrementaNumero(),
                Operadores.decrementaNumero(),
                Operadores.numeroDiferenteDeZero(),
                Operadores.numeroIgualAZero(),
                Operadores.numeroMaiorQueZero(),
                Operadores.numeroMenorQueZero(),
                valor,
                Operadores.inversoDoValor(valor)
        );
    }
}
