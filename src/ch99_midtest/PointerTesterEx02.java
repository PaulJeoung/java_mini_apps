package ch99_midtest;

public class PointerTesterEx02 {

	public static void main(String[] args) {
	
		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);
		
		System.out.printf("a = (%d, %d)", a.getX(), a.getY());
		System.out.println();
		System.out.printf("b = (%d, %d, %d)", b.getX(), b.getY(), b.getZ());
	}
}