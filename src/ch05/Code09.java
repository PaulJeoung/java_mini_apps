package ch05;

public class Code09 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[][] newStrArray = new String[2][4];
//		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray[0], 0, oldStrArray.length);
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
//		for(int i=0; i<newStrArray.length; i++) {
//				System.out.println(newStrArray[i]);
//		}
		
		for(int i=0; i<newStrArray.length; i++) {
			for(int j=0; j<newStrArray[i].length; j++) {
//				newStrArray[i][j] = "0"; 
				System.out.print(newStrArray[i][j]);
			}
			System.out.println("==");
		}

	}

}
