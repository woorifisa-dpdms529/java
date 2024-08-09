package step06polymorphism.step02param;

public class Animal {
	String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	void play() {
		System.out.println(name + "과 산책을 한다.");
	}
}
