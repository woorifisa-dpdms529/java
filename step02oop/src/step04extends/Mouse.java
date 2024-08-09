package step04extends;

public class Mouse extends Animal {
	// 자신만의 필드를 확장
	private String address;

	public Mouse() {
		super();
		System.out.println("Mouse called()");
	}

	public Mouse(int age, String color) {
		super(age, color);
	}
	
	public Mouse(int age, String color, String address) {
//		super(age, color);
		this(age, color);
		this.address = address;
	}

	@Override
	public void sing() {
		System.out.println("ZZIC ZZIC");
	}

	@Override
	public String toString() {
		return "Mouse [address=" + address + ", age=" + getAge() + ", color=" + getColor() + "]";
	}
}
