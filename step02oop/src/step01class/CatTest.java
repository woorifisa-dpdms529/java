package step01class;

public class CatTest {

	public static void main(String[] args) {
		Cat tom = new Cat();
		tom.name = "Tom";
		tom.age = 10;
		System.out.println(tom + " " + tom.name + " " + tom.age);
		
		Cat kitty = new Cat();
		kitty.name = "Kitty";
		kitty.age = 2;
		System.out.println(kitty + " " + kitty.name + " " + kitty.age);
	}

}
