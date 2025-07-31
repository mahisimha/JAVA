
public class Main {
    public static void main(String[] args) {

        var calculate = new TaxCalculator(100_000);// constructor injection
        var report = new TaxReport();
        report.show(calculate);

        // report.setCalculator(new TaxCalculator_1(100_000));// setter injection
        // report.show(new TaxCalculator_1(100_000));// method injection

    }

}
