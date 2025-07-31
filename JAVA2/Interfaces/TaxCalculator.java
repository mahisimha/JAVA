
public class TaxCalculator extends Object implements TaxInterface {

    private double tax;

    public TaxCalculator(double tax) {
        this.tax = tax;
    }

    @Override
    public double taxable() {
        return tax * 0.3;
    }
}
