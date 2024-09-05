package ch98.no1;

import java.util.Scanner;

public class Calculator {
	
	private static String PLUS = "+";
	private static String MINUS = "-";
	private static String MULTIPLY = "*";
	private static String DEVIDE = "/";
	private static String EXIT = "q";
	
	Scanner scanner = new Scanner(System.in);

	public String getPlus() {
		return PLUS;
	}
	public String getMinus() {
		return MINUS;
	}
	public String getMultiply() {
		return MULTIPLY;
	}
	public String getDivide() {
		return DEVIDE;
	}
	public String getExit() {
		return EXIT;
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	int minus(int x, int y) {
		return x-y;
	}
	int mutiply(int x, int y) {
		return x*y;
	}
	int divide(int x, int y) {
		return x/y;
	}
}
