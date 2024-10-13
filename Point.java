public class Point {
    private int x;
    private int y;

    // no args constructor
    public Point() {}

    // parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point a) {
        return distance(a.x, a.y);
    }

    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
