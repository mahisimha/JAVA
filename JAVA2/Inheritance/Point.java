
public class Point extends Ui {
    private int x;
    private int y;

    public Point(int x, int y) {
        super(true);
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        var point = (Point) obj;
        return point.x == x && point.y == y;
    }

    @Override
    public void render() {
        System.out.println("render Point");
    }

}
