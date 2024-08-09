package step01variables;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Command-line arguments:");
		for (String s : args) {
			System.out.println(s);
		}
	}
}
