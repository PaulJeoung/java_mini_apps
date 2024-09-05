package ch99_exercise;

public class Pointer3D extends Pointer2D{

	private int z;
	
	public Pointer3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return this.z;
	}
	
}
