package step03settergetter;

public class Mouse {
	private String color;

	public Mouse(String color) {
		super();
		this.color = color;
	}
	
	public void setColor(String color) {
		if(color == "white") {
			System.out.println("너 누구야!!!");
			return;
		}
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
