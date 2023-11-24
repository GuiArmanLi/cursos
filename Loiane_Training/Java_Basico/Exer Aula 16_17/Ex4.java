public class Ex4 {
    public static void main(String[] args) {
        var peopleA = 80000;
        var peopleB = 200000;
        int year;

        for (year = 0; peopleA < peopleB; year++) {
            peopleA *= 1.03;
            peopleB *= 1.015;
        }

        System.out.println("Populacao A: " + peopleA);
        System.out.println("Populacao B: " + peopleB);
        System.out.println("Levou " + year + " anos para o pais A superar o B");
    }
}
