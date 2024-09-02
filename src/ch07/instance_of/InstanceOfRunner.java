package ch07.instance_of;

public class InstanceOfRunner {

	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student student) {
			System.out.println("studentNo : " + student.studentNo);
			student.stydy();
		}
	}
	public static void main(String[] args) {
		
		Person person1 = new Person("Hong gil-dong");
		personInfo(person1);
		System.out.println();
		
		Person person2 = new Student("김길동", 10);
		personInfo(person2);

	}

}
