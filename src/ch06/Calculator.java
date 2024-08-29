package ch06;

public class Calculator {
	 void powerOn() {
		 System.out.println("시스템의 전원을 켭니다");
	 }
	 
	 void powerOff() {
		 System.out.println("시스템의 전원을 끕니다");
	 }
	 
	 static double pi = 3.14159;
	 
	 static int plus(int x, int y) {
		 int result = x + y;
		 return result;
	 }
	 
	 static int minus(int x, int y) {
		 int result = x - y;
		 return result;
	 }
	 
	 static double multiple(int x, int y) {
		 double result = x * y;
		 return result;
	 }
	 
	 static double divide(int x, int y) {
		 double result = x / y;
		 return result;
	 }
	 
	 // 정사각형 넓이
	 double areaRectangle(double width) {
		 return width * width;
	 }
	 
	 // 직사각형 넓이
	 double areaRectangle(double width, double height) {
		 return width * height;
		 
	 }
	 
}
