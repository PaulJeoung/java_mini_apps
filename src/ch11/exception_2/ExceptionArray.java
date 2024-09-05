package ch11.exception_2;

public class ExceptionArray {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "220"};
		
		for (int i=0; i<5; i++) { // (int i=0; i<array.length; i++)
			try {
				
				if (i == 4) {
	                String test = null;
	                test.length();
	            }
				
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"] : "+value);
				
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("OVER THE INDEX : "+e.getMessage());
			} catch (NumberFormatException e) { // (NullPointerException | NumberFormatException e)
				System.out.println("CAN NOT TRANSMIT THE INT TYPE : "+e.getMessage());
			} catch (Exception e) {
				System.out.println("[SYSTEM OCCURS PROBLUM]");
			} 
		}

	}

}
