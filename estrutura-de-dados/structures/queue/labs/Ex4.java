package structures.queue.labs;

import structures.queue.Queue;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        var queue = new Queue<Integer>();
        
        final int AMOUNT = 100;
        for (int i = 0; i < AMOUNT; i++) {
            queue.add(i + 1);
        }
        
        var random = new Random();
        var limit = random.nextInt(0,100);
        System.out.println("Batata...");
        for (int i = queue.peek(); i < limit; i++) {
            System.out.println("Quente!");
            try {
                Thread.sleep(random.nextInt(0, 1));
                queue.remove();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }//Logica nao funciona

        if (queue.isEmpty()) {
            System.out.println("Todos se salvaram!");
        } else {
            System.out.println("Batata queimou na crianca numero " + (limit - queue.size()) + "!");
        }
    }
}
