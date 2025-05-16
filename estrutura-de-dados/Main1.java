import Vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.add("Coco");
        for (int i = 0; i < vetor.size(); i++) {
            System.out.println(vetor.toString());
        }
    }

}
