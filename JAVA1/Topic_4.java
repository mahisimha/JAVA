public class Topic_4 {

    public static void main(String[] args) {
        int age = 17;
        String type = (age >= 18) ? "adult" : "minor";
        System.out.println(type);

        for (int i = 0; i < 10; i++) {
            if (i == 7)
                break; // leave the loop completely
            if (i % 2 == 0)
                continue; // skip even numbers, go to next iteration
            System.out.print(i + " "); // 1 3 5
        }
        int i = 6;
        while (i > 0) {
            System.out.println("loop");
            i--;
        }
        do {
            System.out.println("do while ");
            i++;
        } while (i < 5);

        int[] numbers = { 3, 9, 5, -5 };
        for (int n : numbers) {
            System.out.println(n);// 3,9,5,-5

        }

        greetUser("Mahi", "reddy");
    }

    public static void greetUser(String firstname, String lastName) {
        System.out.println("hello" + " " + firstname + " " + lastName);
    }

}
