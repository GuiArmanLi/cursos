public abstract class Taxpayer {
    private String name;
    private double grossIncome;

    public Taxpayer() {
    }

    public Taxpayer(String name, double grossIncome) {
        this.name = name;
        this.grossIncome = grossIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public abstract double calculateTax();
}
