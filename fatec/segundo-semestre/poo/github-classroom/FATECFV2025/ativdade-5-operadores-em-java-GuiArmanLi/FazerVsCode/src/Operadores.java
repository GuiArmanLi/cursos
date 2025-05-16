
public class Operadores {
    private static double numero = 0;

    public static double adicao(double primeiroValor, double segundoValor) {
        return primeiroValor + segundoValor;
    }

    public static double subtracao(double primeiroValor, double segundoValor) {
        return primeiroValor - segundoValor;
    }

    public static double multiplicacao(double primeiroValor, double segundoValor) {
        return primeiroValor * segundoValor;
    }

    public static double divisao(double primeiroValor, double segundoValor) {
        if (segundoValor == 0) {
            return 0;
        }

        return primeiroValor / segundoValor;
    }

    public static double incrementaNumero(){
        return ++numero;
    }

    public static double decrementaNumero(){
        return --numero;
    }

    public static Boolean numeroMenorQueZero(){
        return numero < 0;
    }
    
    public static Boolean numeroMaiorQueZero(){
        return numero > 0;
    }

    public static Boolean numeroIgualAZero(){
        return numero == 0;
    }

    public static Boolean numeroDiferenteDeZero(){
        return numero != 0;
    }

    public static Boolean inversoDoValor(Boolean valor){
        return !valor;
    }
}
