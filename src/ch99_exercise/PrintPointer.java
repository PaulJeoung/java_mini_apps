package ch99_exercise;

public class PrintPointer {

	public static void main(String[] args) {
		
		Pointer3D obj = new Pointer3D(10, 20, 30);
		
		int x = obj.getX();
		int y = obj.getY();
		int z = obj.getZ();
		
		System.out.println("x : "+x+", y : "+y+", z : "+z);

	}

}
