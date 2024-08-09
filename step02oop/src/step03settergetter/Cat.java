package step03settergetter;

public class Cat {

	private int age;
	private String name;

	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	// 값이 변경될 필요가 없을 경우 구현 X
//	public void setName(String name) {
//		this.name = name;
//	}
}
