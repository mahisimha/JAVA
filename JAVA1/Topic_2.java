import java.util.Arrays;

public class Topic_2 {
    public static void main(String[] args) {
        String message = "   hello World" + "!";

        System.out.println(message.replace("l", "o"));// replaces every target with replacement
        System.out.println(message.toLowerCase());// hello world!
        System.out.println(message.toUpperCase());// HELLO WORLD!
        System.out.println(message.trim());// trims the white spaces before the first letter

        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        System.out.println(number);// [I@4517d9a3
        System.out.println(Arrays.toString(number));// [1, 2, 0, 0, 0]

        int[][] num = new int[2][3];// 2 rows, 3 columns
        num[0][0] = 1;
        System.out.println(num);// [[I@372f7a8d
        System.out.println(Arrays.deepToString(num));
        // final float PI = 3.14F;
        // PI = 1;// error because here PI cannont be reassigned as we used final
        // keyword

        int x = 50;// order - () ; /,*,% ; +,- (left to rigth)
        int y = x / 4 % 3 * 2 + 1 - x % 7 / 2;// 1
        y = x + 4 / 6;// 50
        System.out.println(y);

        // implicit casting
        // byte > short > int > long > float > double
        short a = 1;
        int b = a + 2;
        // explicit casting
        double c = 1.1;
        int d = (int) c + 5;

        String e = "1";
        int f = Integer.parseInt(e) + 2;

        System.out.println(b);
        System.out.println(d);
        System.out.println(f);

    }

}
