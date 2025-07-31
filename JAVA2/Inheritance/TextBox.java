
public class TextBox extends Ui {
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println(this.status());
        System.out.println("Text");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public void render() {
        System.out.println("render Textbox");
    }

}
