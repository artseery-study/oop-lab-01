public class PlaneStrategy implements MoveStrategy {
    @Override
    public void move(Point startPoint, Point targetPoint) {
        System.out.printf("Пролетел на самолете от %s до %s, дистанция: %d%n", startPoint.getCoordinates(), targetPoint.getCoordinates(), startPoint.getDistance(targetPoint));
    }
}
