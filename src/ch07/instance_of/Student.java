package ch07.instance_of;

public class Student extends Person{
	
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void stydy() {
		System.out.println("공부를 합니다");
	}
}
