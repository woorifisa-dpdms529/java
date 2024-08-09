package step05abstract;

public class Mouse extends Animal{
	public Mouse() {
		this.sound = "찍찍쓰";
	}
	
	@Override
	public void sing() {
		System.out.println(this.sound);
	}
}
