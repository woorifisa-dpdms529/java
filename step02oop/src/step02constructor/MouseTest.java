package step02constructor;

public class MouseTest {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		System.out.println(m);
		
		Mouse m2 = new Mouse(2);
		
		Mouse m3 = new Mouse("jerry");
		
		Mouse m4 = new Mouse(5, "micky");
	}

}
