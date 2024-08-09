package step03methods;

import java.util.Random;

public class Basic {

	public static void main(String[] args) {
		String result = drinkMachine(2);
		System.out.println(result);
		
	}

	// 접근제어자(public) 그 외 제어자(static) 반환타입 메서드명(파라미터 명세) {}
	public static String drinkMachine(int number) {
		
		// 메서드 구현부
		String drink = null; // 값이 할당되지 않았다는 의미의 null keyword
		
		if (number == 1) {
			drink = "제로 콜라";
		} else if (number == 2) {
			drink = "스프라이트";
		}
		
		return drink; // 반환 타입은 String 타입의 값
	}
	
	// 반환타입이 없을 때 void 사용
	public static void drinkMachine() {
		int number = new Random().nextInt(2); // number는 지역 변수

        if (number == 0) { // 랜덤 번호가 0일 경우 스프라이트
            System.out.println("현재 스프라이트의 재고가 없습니다.");
        } else if (number == 1) { // 랜덤 번호가 1일 경우 닥터페퍼
            System.out.println("현재 닥터 페퍼의 재고가 없습니다.");
        } else if (number == 2)  { // 랜덤 번호가 2일 경우 물
            System.out.println("현재 물의 재고가 없습니다.");
        }
	}	
}