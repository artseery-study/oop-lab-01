public class Hero {
    private String name;
    private Point startPosition;
    private MoveStrategy moveStrategy;

    public Hero(String name, Point startPosition, MoveStrategy moveStrategy) {
        this.name = name;
        this.startPosition = startPosition;
        setMoveStrategy(moveStrategy);
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move(Point target) {

    }
}