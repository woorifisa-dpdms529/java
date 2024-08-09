package step01variables;

public class Basic {

	public static void main(String[] args) {
		// 1. 변수의 생성, 선언과 초기화로 이루어짐

		// 1-1. 변수의 선언
		int a;
		// 1-2. 변수의 초기화
		a = 5;
		// 선언과 초기화를 한 줄로 작성
		int b = 10;
		// 2. 변수명 이름 짓기(Naming Convention)
		// 문법적으로 허용은 되나, 일반적인 규칙상 사용하지 않는 케이스도 있음
		// 2-1. 영문자(대소문자)
		int alphabet = 26;
		int Upper = 5; // 단순히 문법적으로 허용이 될뿐, 변수명을 대문자로 시작하진 않음.(camelCase 사용)

		// 2-2. 특수문자($, _ 기호만 해당, !@# 등은 불가능), 레거시 코드에서 주로 사용, 교안 참조
		int $isLogin = 0;
		int _isLogin = 0;

		// 2-2. 숫자로 시작할 수 없음
		// int 5 = 5; // ?

		// 2-3. 키워드, 예약어 사용 불가(while, int, break 등), 교안 참조
		// int int = 5; // ??
	}

}
