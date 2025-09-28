package structures.queue.labs;

import model.Password;
import structures.queue.Queue;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Queue red = new Queue<Password>();
    private static Queue yellow = new Queue<Password>();
    private static Queue green = new Queue<Password>();

    public static void main(String[] args) {

        final int AMOUNT = 6;
        for (int i = 0; i < AMOUNT; i++) {
            System.out.printf("O paciente %s e prioridade? [y/n]", (i + 1));
            var priority = scanner.next();

            if (priority.equals("y"))
                red.add(new Password(random.nextInt(0, 100), true));
            else
                yellow.add(new Password(random.nextInt(0, 100), false));

            while (!red.isEmpty() && !yellow.isEmpty() && !green.isEmpty()) {
                getRandomPassword(); //Surge um paciente a cada 4 segundos, mas vou fazer em 6 com threads
                try {//Preciso fazer codigo abaixo rodar em paralelo com a linha de cima
                    while (!green.isEmpty()) {
                        while (!yellow.isEmpty()) {
                            while (!red.isEmpty()) {
                                System.out.println("Paciente " + red.pool() + " atendido");
                                Thread.sleep(5000);
                            }

                            System.out.println("Paciente " + yellow.pool() + " atendido");
                            Thread.sleep(5000);
                        }

                        System.out.println("Paciente " + green.pool() + " atendido");
                        Thread.sleep(5000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.exit(1);
        }
    }

    //Fazer isso paralelamente em 4 segundos
    private static void getRandomPassword() {
        var password = new Password(random.nextInt(0, 100), random.nextInt(0, 2));
        if (password.getPriorityLevel() == 0) {
            green.add(password);
        } else if (password.getPriorityLevel() == 1) {
            yellow.add(password);
        } else {
            red.add(password);
        }
    }

}
