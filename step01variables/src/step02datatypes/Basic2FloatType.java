package step02datatypes;

public class Basic2FloatType {

	public static void main(String[] args) {
		// 정수형(양의 정수, 0, 음의 정수)

		// 정수형 타입의 종류, 왼쪽부터 값을 담을 수 있는 크기가 작음
		// byte, short, int(주로 사용, 기본 타입), long
		byte a = 127; // 허용되는 가장 큰 값을 할당, 허용 범위: -128 ~ 127, 2^8(256)
		short b = -32768; // 허용되는 가장 작은 값을 할당, 허용 범위: -32768 ~ 32767
		int c = 0; // 허용 범위: 약 20억, 정수형을 사용할 때 주로, 기본으로 사용하는 타입
		long d = 20000000000L; // 2의 63제곱
		// int is out of range
		// int가 정수형에서 기본 타입으로 사용되기 때문에 작성한 200억은 int형으로 인식되고,
		// int의 값을 벗어났기 때문에 발생
		// long 타입을 의미하는 l or L 같은 접미사 사용

		// Java 7버전 리터럴 중간에 구분자인 _(Underscore) 작성 가능, 가독성 향상
		long e = 20_000_000_000L;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
