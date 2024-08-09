package step01class;

// 내가 생성한 Mouse 클래스가 실제로 활동할 수 있는 공간
public class Ground {
	public static void main(String[] args) {
		//Mouse 객체 생성
		Mouse jerry = new Mouse();
		jerry.name = "jerry";
		System.out.println(jerry.name);
		jerry.sing();
	}
}
