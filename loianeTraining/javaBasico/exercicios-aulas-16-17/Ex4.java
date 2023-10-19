public class Ex4 {
    public static void main(String[] args) {
        var populationA = 80000;
        var populationB = 200000;
        int ano;

        for (ano = 0; populationA < populationB; ano++) {
            populationA *= 1.03;
            populationB *= 1.015;
        }

        System.out.println("Levou " + ano + " anos para o pais A superar o B");
    }
}
