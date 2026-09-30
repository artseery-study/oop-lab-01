public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistance(Point targetPoint) {
        return (int) Math.hypot(targetPoint.x - x, targetPoint.y - y);
    }
}