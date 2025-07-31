
public class Ui {
    private boolean isEnabled = true;

    public Ui(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI");

    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean status() {
        return isEnabled;
    }

    public void render() {
        System.out.println("render Ui");
    }

}
