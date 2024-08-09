package step04extends;

public class MouseTest {

	public static void main(String[] args) {
//		Animal anAnimal = new Animal();
//		anAnimal.sing();

		Animal jerry = new Mouse(5, "brown");
		jerry.sing();
		
		Mouse jamie = new Mouse(15, "black", "플로리다");
		jamie.sing();
		
		System.out.println(jamie);
	}

}
