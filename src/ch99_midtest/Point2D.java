package ch99_midtest;

public class Point2D {

    private int x;
    private int y;
    // 생성자
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // setter x, y
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    // getter x,y
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}
