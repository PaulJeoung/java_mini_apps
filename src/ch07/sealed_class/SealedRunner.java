package ch07.sealed_class;

public class SealedRunner {

	public static void main(String[] args) {
		
		Person person = new Person();
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		
		person.work();
		employee.work();
		manager.work();
		director.work();

	}

}
