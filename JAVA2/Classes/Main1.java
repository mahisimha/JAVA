

public class Main1 {
    public static void main(String[] args) {
        var obj1 = new Class1(30_000);
        obj1.setHourlyRate(30);
        System.out.println(obj1.calculateWage(3));
        Class1.printNumberOfEmployees();// calling static method

        var obj2 = new Class1(25_000, 20);
        System.out.println(obj2.calculateWage(50));
        Class1.printNumberOfEmployees();

    }
}
