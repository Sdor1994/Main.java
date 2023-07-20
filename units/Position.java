package units;

public class Position {
    public int positionX;
    public int positionY;


    public Position(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double calcDistance(Position point){
        int dx = point.positionX - positionX;
        int dy = point.positionY - positionY;
        return Math.sqrt((dx*dx)+(dy*dy));
    }

}
