public class PhysicalPerson extends Taxpayer {
    PhysicalPerson() {
        super();
    }

    PhysicalPerson(String name, double grossIncome) {
        super(name, grossIncome);
    }

    @Override
    public double calculateTax() {
        if (super.getGrossIncome() < 1400) {
            return 0;
        } else if (super.getGrossIncome() > 1400 && super.getGrossIncome() < 2100) {
            return super.getGrossIncome() * 0.1;
        } else if (super.getGrossIncome() > 2100 && super.getGrossIncome() < 2800) {
            return super.getGrossIncome() * 0.15;
        } else if (super.getGrossIncome() > 2800 && super.getGrossIncome() < 3600) {
            return super.getGrossIncome() * 0.25;
        }
        return super.getGrossIncome() * 0.3;
    }
}
