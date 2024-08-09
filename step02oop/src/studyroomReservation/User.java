package studyroomReservation;

import java.util.*;

public class User {
	// 이름
	private String name;
	// 핸드폰 번호 뒷자리
	private String phone;

	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// 좌석 정보 확인 후 선택
	int selectDesk(List<Seat> desks) {
		System.out.println("----------좌석 정보 확인----------");

		for (int i = 0; i < desks.size(); i++) {
			Seat desk = desks.get(i);
			System.out.println(i + "번 예약정보");
			System.out.println(desk);
		}
		
		System.out.println("----------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("예약번호를 입력하세요 : ");
		int idx = sc.nextInt();

		return idx;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

}
