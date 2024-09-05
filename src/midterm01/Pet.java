package midterm01;

public class Pet {

	private String pet;
	private String owner;
	
	public Pet (String pet, String owner) {
		this.pet = pet;
		this.owner = owner;
	}
	
	public String getPet(String pet) {
		return this.pet;
	}
//	public void setPet() {
//		this.pet = pet;
//	}
	
	public String getOwner(String owner) {
		return this.owner;
	}
//	public void setOwner() {
//		this.owner = owner;
//	}
	
	public void introduce() {
		System.out.println("내이름은 " + pet + " 입니다");
		System.out.println("주인님은 " + owner + " 입니다");
	}
}
