package obj;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void print() {
        System.out.println("Coordenaties = X - " + this.x + "; Y - " + this.y);
    }
}
