package Calculadora;

public class Calculadora {
    public static void main(String[] args) {
        for (Operacoes operacao : Operacoes.values()) {
            System.out.println(operacao.executarOperacao(10, 5));
        }
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