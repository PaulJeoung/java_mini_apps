package ch99_midtest;

public class Point3D extends Point2D {

    private int z;
    // 생성자
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    // settter
    public void setZ(int z) {
        this.z = z;
    }
    // getter
    public int getZ() {
        return this.z;
    }
}
