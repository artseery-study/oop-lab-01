public class Hero {
    private final String name;
    private Point currentPosition;
    private MoveStrategy moveStrategy;

    public Hero(String name, Point currentPosition, MoveStrategy moveStrategy) {
        this.name = name;
        this.currentPosition = currentPosition;
        setMoveStrategy(moveStrategy);
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void move(Point targetPosition) {
        System.out.print(name + " ");
        moveStrategy.move(currentPosition, targetPosition);
        currentPosition = targetPosition;
    }
}
