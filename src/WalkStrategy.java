public class WalkStrategy implements MoveStrategy {
    @Override
    public void move(Point startPoint, Point targetPoint) {
        System.out.printf("Прошел пешком от %s до %s, дистанция: %d%n", startPoint.getCoordinates(), targetPoint.getCoordinates(), startPoint.getDistance(targetPoint));
    }
}
