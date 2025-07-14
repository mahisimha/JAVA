import java.text.NumberFormat;
import java.util.Scanner;

public class Topic_3 {
    public static void main(String[] args) {
        int round = Math.round(1.1F);
        double ceil = Math.ceil(1.1F);// here Math.ceil returns double value
        double floor = Math.floor(1.1F);// here Math.floor returns double value

        int random = (int) (Math.random() * 100);// Math.random returns value like 0.8839322
                                                 // so we explicity cast it to integer after * 100 so that we have
                                                 // random integer
        System.out.println(round);// 1
        System.out.println(ceil);// 2.0
        System.out.println(floor);// 1.0
        System.out.println(random);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345678.9);
        System.out.println(result);// ₹12,345,678.90

        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(0.89));// 89%

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println(n);
                break;
            case 2:
                System.out.println(n);
                break;
            case 3:
                System.out.println(n);
                break;

            default:
                System.out.println("DEFAULT claue xxxx");
                break;

        }
        // here after nextInt() the keyboard stream is "2" "\r" "\n"
        // nextint() only consumes '2' '\r''\n' stays in system.in
        // String name = scan.nextLine(); when this is called in the buffer it sees
        // '\r"\n' which will return an empty string
        // so to avoid it we add scan.nextLine(); this will consume the '\r''\n'
        scan.nextLine();
        System.out.println("enter name");
        String name = scan.nextLine();
        System.out.println(name);

    }
}
