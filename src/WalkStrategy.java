public class WalkStrategy implements MoveStrategy {
    @Override
    public void move(Point startPoint, Point targetPoint) {
        System.out.printf("Walked from %s to %s, distance: %d%n", startPoint, targetPoint, startPoint.getDistance(targetPoint));
    }
}
