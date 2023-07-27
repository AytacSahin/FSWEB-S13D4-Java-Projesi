public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        // this, bu sınıfın instance variable'larını çağırır...
        this.x = x;
        this.y = y;
    }

    public void Test() {
        System.out.println("[0] Succesfully connecting to Point Class...");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        return Math.sqrt(
                (this.x - p.getX()) * (this.x - p.getX())
                + (this.y - p.getY()) * (this.y - p.getY())
        );
    }

    public double distance(int a, int b) {
        return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
    }
}
