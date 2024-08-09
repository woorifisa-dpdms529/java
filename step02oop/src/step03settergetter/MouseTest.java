package step03settergetter;

public class MouseTest {

	public static void main(String[] args) {
		Mouse mickey = new Mouse("black");
		
		mickey.setColor("white");
		mickey.setColor("pink");
		System.out.println(mickey.getColor());
	}

}
