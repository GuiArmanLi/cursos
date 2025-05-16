public class Liquidificador<T extends Alimentos> {
    private T alimento;

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }

    public String bater() {
        return "Vitamina de " + getAlimento().getClass().toString().replace("class ", "");
    };
}
