package step02datatypes;

public class Basic5Encoding {

	public static void main(String[] args) {
		// Java 에서 작성한 char 타입
		char firstLetter = 'A';
		System.out.println(firstLetter);
		
		// 저장된 문자는 메모리 상에서는 결국 숫자(정수)로 변환됨
		int castedValue = (int)firstLetter;
		System.out.println(castedValue); // ASCII, 65
		
		// ASCII코드 값인 65를 직접 저장해도 결과값은 동일
        char sameWithCastedValue = 65;
        System.out.println(sameWithCastedValue); // A가 출력됨
	}

}
