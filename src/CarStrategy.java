public class CarStrategy implements MoveStrategy {
    @Override
    public void move(Point startPoint, Point targetPoint) {
        System.out.printf("Drove by car from %s to %s, distance: %d%n", startPoint, targetPoint, startPoint.getDistance(targetPoint));
    }
}
