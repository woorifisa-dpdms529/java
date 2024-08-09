package step02constructor;

public class Mouse {
	int age;
	String name;

	// Mouse 클래스에 개발자가 별도의 생성자를 작성하지 않으며,
	// 컴파일러가 기본 생성자를 작성해줌
	// Mouse();

	Mouse() {
		System.out.println("기본 생성자 Mouse called");
	}

	// age 값을 파라미터로 전달받는 생성자
	Mouse(int age) {
		this.age = age;
		System.out.println(age);
	}
	
	Mouse(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	Mouse(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println(age + " " + name);
	}
}
