
public class TaxReport {
    private TaxInterface calculate;

    // public TaxReport(TaxInterface calculate) {
    // this.calculate = calculate;
    // }

    public void show(TaxInterface calculate) {
        var amount = calculate.taxable();
        System.out.println(amount);
    }

    // public void setCalculator(TaxInterface calculate) {
    // this.calculate = calculate;
    // }

}
