import java.awt.Point;

public class Topic_1 {
    public static void main(String[] args) {
        byte b = 10; // 1-byte [-128,127]
        short s = 20_000; // 2-byte [-32k,32k]
        int i = 1_000_000; // 4-byte [-2B,2B]
        long l = 3_000_000_000L; // 8-byte
        float f = 3.14f; // 4-byte
        double d = 2.718281828; // 8-byte
        char c = 'J'; // 2-byte [A,B,C...]
        boolean ok = true; // 1-bit true/false

        System.out.println("Sum = " + (i + c)); // arithmetic on raw values

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // result is 1

        Point point1 = new Point(1, 1);
        Point point2 = point1; // here point point1,point2 are referencing to Point(1,1)
        point1.x = 2; // that is why when we change value by using point1 variable we can see the
                      // change through point2
        System.out.println(point2);// result is point(2,1)

    }

}
