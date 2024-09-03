문제2)
PrinterTestEx02 클래스와 출력 결과를 보고, Point2D 클래스와 Point3D 클래스의 코드를 작성 하시오.
조건에 맞게 표현 해야 함
(클래스명을 Point2D, Point3D, PointerTesterEx02로 만들것)

조건1)
Point2D 클래스와 Point3D 클래스에 생성자, set(), get() 적용할 것
조건2)
Point3D 클래스는 Point2D 클래스를 상속
조건3)
PointerTesterEx02 클래스

... main(...) ... {
	Point2D a = new Point2D (10,15);
	Point3D b = new Point3D (20,30,40);
	System.out.printf("a = (%d, %d) /n", a.getX(), a.getY());
	System.out.printf("b = (%d, %d, %d) /n", b.getX(), b.getY(), b.getZ());
	
출력 결과)
a = (10, 15)
b = (20,30,40)