package structures.queue.labs;

import model.Password;
import structures.queue.Queue;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        var normalQueue = new Queue<Password>();
        var priorityQueue = new Queue<Password>();

        final int AMOUNT = 10;
        for (int i = 0; i < AMOUNT; i++) {
            if (i % 2 == 0) {
                normalQueue.add(new Password(i, false));
            } else {
                priorityQueue.add(new Password(i, true));
            }
        }

        priorityQueue.add(new Password(1, true));
        priorityQueue.add(new Password(1, true));
        priorityQueue.add(new Password(1, true));
        priorityQueue.add(new Password(1, true));

        for (int i = 0; i <= normalQueue.size() + priorityQueue.size(); i++) {
            if (!priorityQueue.isEmpty()) {
                for (int j = 0; j < 3 && !priorityQueue.isEmpty(); j++) {
                    Password password = null;
                    try {
                        password = priorityQueue.pool();
                        if (password != null)
                            System.out.printf("Atendimento da senha %s - Prioridade? %s\n", password.getNumber(), password.getPriority());
                    } catch (IndexOutOfBoundsException e) {
                        break;
                    }
                }
            }

            if (!normalQueue.isEmpty()) {
                var password = normalQueue.pool();
                System.out.printf("Atendimento da senha %s - Prioridade? %s\n", password.getNumber(), password.getPriority());
            }
        }
    }
}
