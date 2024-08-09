package step06polymorphism.step02param;

public class App {

	public static void main(String[] args) {
		Cat tom = new Cat("톰");
		Mouse mouse = new Mouse("제리");
		
		Person p = new Person();
		p.walk(tom);
		p.walk(mouse);
	}

}
