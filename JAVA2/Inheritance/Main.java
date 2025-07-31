
public class Main {
    public static void main(String[] args) {

        var control = new Ui(false);
        System.out.println(control.status() + "1");
        control.enable();
        System.out.println(control.status() + "2");

        TextBox box1 = new TextBox();
        var box2 = box1;
        box1.setText("zyx");
        System.out.println(box1.toString() + "  " + "3");
        System.out.println(box2.hashCode() + "  " + "4");
        System.out.println(box1.status() + "  " + "5");

        var control1 = new Ui(true);
        var text1 = new TextBox();
        show(text1);

        var point1 = new Point(10, 12);
        var point2 = new Point(11, 11);
        System.out.println(point1.equals(control1));// comparing two objects

        Ui[] contorlUis = { new TextBox(), new Point(11, 22), new Ui(true) };
        for (var contorl : contorlUis) {
            contorl.render();// Polymorphism
        }
    }

    public static void show(Ui control1) {// show(text1) here text1 is upcassted to control1 but
                                          // control1 cannot acces methods of Textbox we downcast is to textbox
                                          // explicitly in line 44

        if (control1 instanceof TextBox) {
            TextBox text1 = (TextBox) control1;
            text1.setText("Null");
        }
        System.out.println(control1 + "  " + "6");
    }
}