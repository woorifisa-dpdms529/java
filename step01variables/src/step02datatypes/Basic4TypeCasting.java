package step02datatypes;

public class Basic4TypeCasting {

	public static void main(String[] args) {
		// 값의 허용범위에 따른 값의 저장
		byte a = 120;
		int b = 120;
		long c = 120;
		// 리터럴 123은 현재 int 타입으로,
		// 변수 c의 타입인 long보다 허용 범위가 더 넓기 때문에 문제 없이 저장 가능

		// 리터럴의 타입이 담고자 하는 변수의 타입보다 허용 범위가 작은 경우
//		byte e = 130; // Type mismatch: cannot convert from int to byte
		// byte 타입의 범위를 초과하였기 때문에 저장 불가능

//		float f = 5.5; // Type mismatch: cannot convert from double to float
		// 부동소수점의 기본 타입은 double이기 때문에 5.5 뒤에 D가 생략되어 있음
		
		// 타입 변환(Type Castiong), 형(形)변환
		// double 타입인 리터럴 5.5를 float 타입의 변수 f에 저장하기 위한 방법?
		
		// 첫 번째 방법, double 타입의 리터럴 5.5 뒤에 접미사 f를 추가해서 애초에 float으로 작성 
		float g = 5.5F;
		
		// 두 번째 방법. 형 변환을 활용해서 double 타입의 리터럴 5.5를 float 타입으로 변환
		float h = (float)5.5;	
		
		 // 6-1-1. 타입의 범위를 초과하는 값을 강제로 형 변환하여 저장할 경우
        byte k = (byte)128;
        System.out.println(k); // ?, -128출력, 오버 플로우
        // 오버플로우 참조 링크 : https://www.baeldung.com/java-overflow-underflow

        // 6-2. 서로 다른 타입 간의 형 변환
        int l = (int)5.0F;

        // 6-2-1. 서로 다른 타입 간의 형 변환 과정에서 발생할 수 있는 값의 손실
        int m = (int)5.5F;
        System.out.println(m); // 변수 l은 정수 타입이기 때문에 변환 과정에서 0.5가 손실되어 5.5가 아닌 5가 출력됨

        // 6-3. 자동 형 변환(Implicit casting)
        // 어떤 변수에 저장하고자 하는 리터럴(값)이 가질 수 있는 값의 범위가 변수가 가진 타입보다 작을 경우 컴파일러가 자동으로 형 변환 코드를 작성해줌
        long n = 135; // 리터럴 135는 int 타입이지만 long의 범위가 int보다 더 넓기 때문에 자동으로 long n = (long)135;로 작성됨

        float o = 100; // 서로 다른 타입이어도, 정수보다 실수가 값을 저장할 수 있는 범위가 더 크기 때문에 가능.

        // 6-3-1. 반대로 값의 범위가 더 큰 타입에서 작은 타입으로의 형 변환은 자동으로 작성해주지 않음.
        // byte p = 130;
	}

}
