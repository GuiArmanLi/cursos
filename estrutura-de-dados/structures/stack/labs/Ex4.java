package structures.stack.labs;

import model.Book;

import java.util.Scanner;
import java.util.Stack;

public class Ex4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var stack = new Stack<Book>();

        final int AMOUNT = 6;
        for (int i = 0; i < AMOUNT; i++) {
            stack.push(new Book("Livro " + (i + 1), "Numero " + (i + 1), (2000 + i + 1), "Autor " + i));
        }

        while (true) {
            System.out.printf("Digite um numero correspondente a operacao: " +
                    "\n1 = Verifica se a pilha esta vazia" +
                    "\n2 = Verifica qual elemento esta no topo da pilha" +
                    "\n3 = Desempilha elemento na pilha" +
                    "\n4 = Empilha elemento na pilha" +
                    "\n5 = Retorna index do elemento na pilha" +
                    "\n0 = Encerra programa\n");

            var choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Pilha esta vazia?: %s\n", stack.isEmpty());
                    break;

                case 2:
                    System.out.printf("Elemento no topo da pilha: %s\n", stack.peek());
                    break;
                case 3:
                    System.out.printf("Elemento %s removido da pilha\n", stack.pop());
                    break;
                case 4:
                    System.out.print("Digite o nome, isbn, ano de lancamento e nome do autor do livro: ");
                    stack.push(new Book(scanner.next(), scanner.next(), scanner.nextInt(), scanner.next()));
                    break;
                case 5:
                    System.out.printf("Sempre retorna %s porque o metodo recebe um objeto, nesse caso pegamos o ultimo\n", stack.search(stack.peek()));
                    break;
                case 0:
                    System.exit(1);
            }
        }
    }
}
