public class LegalPerson extends Taxpayer {
    LegalPerson() {
        super();
    }

    LegalPerson(String name, double grossIncome) {
        super(name, grossIncome);
    }

    @Override
    public double calculateTax() {
        return super.getGrossIncome() * 0.1;
    }
}