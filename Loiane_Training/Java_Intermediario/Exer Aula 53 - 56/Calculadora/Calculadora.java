package Calculadora;

public class Calculadora {
    public static void main(String[] args) {
        double soma = Operacoes.SOMAR.executarOperacao(10, 10);
        double subtracao = Operacoes.SUBTRAIR.executarOperacao(10, 10);
        double multiplicacao = Operacoes.MULTIPLICAR.executarOperacao(10, 10);
        double divisao = Operacoes.DIVIDIR.executarOperacao(10, 10);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}

enum Operacoes {
    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    Operacoes(String operacao) {
        this.operacao = operacao;
    }

    private String operacao;

    public String getOperacao() {
        return this.operacao;
    }

    public abstract double executarOperacao(double x, double y);
}