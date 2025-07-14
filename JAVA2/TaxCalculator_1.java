package JAVA2;

public class TaxCalculator_1 implements TaxInterface {
    private double num;

    public TaxCalculator_1(double num) {
        this.num = num;
    }

    @Override
    public double taxable() {
        return num * 0.4;
    }

}
