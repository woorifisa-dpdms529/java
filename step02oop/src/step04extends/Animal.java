package step04extends;

public abstract class Animal {
	private int age;
	private String color;
	
	public Animal() {
		super();
		System.out.println("An Animal called()");
	}
	
	public Animal(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}
	
	abstract public void sing();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
