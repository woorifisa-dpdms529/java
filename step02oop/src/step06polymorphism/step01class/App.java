package step06polymorphism.step01class;

public class App {

	public static void main(String[] args) {
		// Java에서 배열 []
		// Animal[] - Animal타입만 요소로 받을 수 있는 배열
		// new Animal[3] - 3개의 요소를 받을 수 있는 고정 길이의 배열
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Mouse();
		animals[2] = new Whale();
		
		for(Animal animal : animals) {
			animal.sing();
		}
	}
}
