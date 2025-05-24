package structures.queue.labs;

import model.Document;
import structures.queue.Queue;

public class Ex1 {
    public static void main(String[] args) {
        var queue = new Queue<Document>();

        final int AMOUNT = 5;
        for (int i = 0; i < AMOUNT; i++) {
            queue.add(new Document("Documento " + i, (i + 1) * 3));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.pool());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}