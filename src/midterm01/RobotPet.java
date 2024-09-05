package midterm01;

public class RobotPet extends Pet{
	private String robotPet = "로봇";
	
	public RobotPet(String pet, String owner) {
		super(pet, owner);
	}
	
	@Override
	public void introduce() {
		System.out.println("저는 " + robotPet + "입니다. 이름은 " + getPet(robotPet) + " 입니다");
		System.out.println("주인님은 " + getOwner(robotPet) + " 입니다");
	}
}
