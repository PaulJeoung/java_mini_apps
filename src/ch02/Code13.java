package ch02;

import java.util.Scanner;

public class Code13 {
	public static void main(String[] args) throws Exception {
		Scanner input_msg = new Scanner(System.in);
		
		System.out.print("input x value : ");
		String strX = input_msg.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("input y value : ");
		String strY = input_msg.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println();
		
		while (true) {
			System.out.print("[exit rule -> exit] Input String Type : ");
			String data = input_msg.nextLine();
			if (data.equals("exit")) {
				System.out.println("Programs out");
				break;
			}
			System.out.println("Output String Type : " + data);
			System.out.println();
			
		}
		
	}
}
