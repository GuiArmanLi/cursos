package structures.array.labs;

import model.Contact;
import structures.array.Array;

import java.util.Scanner;

public class Ex6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var array = new Array<Contact>(20);

        final int QUANTIDADE_CONTATOS = 30;
        for (int i = 0; i < QUANTIDADE_CONTATOS; i++) {
            array.add(new Contact("Usuario" + (i + 1), "5511912345678", "usuario" + (i + 1) + "@gmail.com"));
        }

        while (true) {
            System.out.printf("Digite um numero correspondente a operacao: " +
                    "\n1 = Adiciona elemento" +
                    "\n2 = Adiciona elemento no index desejado" +
                    "\n3 = Limpa lista" +
                    "\n4 = Verifica se contem elemento na lista" +
                    "\n5 = Pega elemento com base no index" +
                    "\n6 = Pega todos os elementos" +
                    "\n7 = Pega o ultimo index do elemento desejado" +
                    "\n8 = Remove elemento com base no index" +
                    "\n9 = Remove elemento" +
                    "\n0 = Encerra programa\n");

            var choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Digite o nome, telefone e email do contato: ");
                    array.add(new Contact(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
                    break;

                case 2:
                    System.out.println("Digite o index do contato, nome, telefone e email do contato: ");
                    scanner.nextLine();
                    array.add(scanner.nextInt(),
                            new Contact(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
                    break;
                case 3:
                    array.clear();
                    break;
                case 4:
                    System.out.println("Sempre retorna true porque verifica se contem o primero objeto!");
                    System.out.println(array.contains(array.get(0)));
                    break;
                case 5:
                    System.out.println("Digite um index para resgatar um elemento: ");
                    try {
                        System.out.println(array.get(scanner.nextInt()));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Index inexistente!");
                    }
                    break;
                case 6:
                    System.out.printf("Todos elementos da lista: %s\n", array.getAll());
                    break;
                case 7:
                    System.out.printf("Ultimo index do %s: %s\n", array.get(0), array.lastIndexOf(array.get(0)));
                    break;
                case 8:
                    System.out.println("Digite o index do elemento que deseja remover: ");
                    array.removeByIndex(scanner.nextInt());
                    break;
                case 9:
                    System.out.println("Remove elemento com base nele mesmo");
                    array.remove(array.get(0));
                    break;
                case 0:
                    System.exit(1);
            }
        }
    }
}
