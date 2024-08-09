package step06polymorphism.step02param;

public class Person {
	
	/**
	 * Animal 타입의 참조변수를 전달받아서 해당 동물과 산책을 하는 메서드
	 * @param animal
	 */
	void walk(Animal animal) { // 호출 시점에 animal이 참조하고 있는 실제 인스턴스가 Cat인지 Mouse인지 모름
		// Animal animal = new Cat("톰");
		
		// 참조변수 animal에 담긴 실제 인스턴스가 Cat인지? 확인하는 조건식
		if (animal instanceof Cat) {
			Cat c = (Cat) animal; // animal 내부에는 new Cat() 인스턴스가 있다는 의미
			// -> 결국에는 Cat c = new Cat("톰")과 같음
			
			animal.play(); // 참조변수 animal이 가지고 있는 실제 인스턴스는 누구?
		} else if (animal instanceof Mouse) {
			
		}
		// 나머지는 Mouse타입
		
	}
}
