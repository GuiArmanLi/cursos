public class Ex18 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 40 };

        var positionYounger = 0;
        var positionOlder = 0;
        var younger = Integer.MAX_VALUE;
        var older = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < younger) {
                younger = a[i];
                positionYounger = i + 1;
            }
            if (a[i] > older) {
                older = a[i];
                positionOlder = i + 1;
            }
        }

        System.out.println("Idade mais novo: " + younger + " esta na posicao " + positionYounger);
        System.out.println("Idade mais velho: " + older + " esta na posicao " + positionOlder);
    }
}
