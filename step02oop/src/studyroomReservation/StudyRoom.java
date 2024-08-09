package studyroomReservation;

import java.time.LocalDateTime;
import java.util.*;

public class StudyRoom {
	// 좌석 정보
	static List<Seat> desks = List.of(new GroupSeat(1, LocalDateTime.of(2024, 8, 9, 18, 0, 0), 6),
			new GroupSeat(2, LocalDateTime.of(2024, 8, 9, 18, 0, 0), 6), new PrivateSeat(3, LocalDateTime.of(2024, 8, 9, 18, 0, 0)),
			new GroupSeat(1, LocalDateTime.of(2024, 8, 9, 19, 0, 0), 6), new GroupSeat(2, LocalDateTime.of(2024, 8, 9, 19, 0, 0), 6),
			new PrivateSeat(3, LocalDateTime.of(2024, 8, 9, 19, 0, 0)), new GroupSeat(1, LocalDateTime.of(2024, 8, 9, 20, 0, 0), 6),
			new GroupSeat(2, LocalDateTime.of(2024, 8, 9, 20, 0, 0), 6), new PrivateSeat(3, LocalDateTime.of(2024, 8, 9, 20, 0, 0)));

	// 사용자 정보
	static List<User> users = List.of(new GroupUser("공소연", "1234", 6), new User("이도이", "2345"), new GroupUser("조예은", "3456", 4),
			new User("유승아", "4567"));

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean continueProgram = true;

		while (continueProgram) {
			User user = login();

			if (user != null)
				reserve(user);

			String cont = "";
			while (!cont.equals("y") && !cont.equals("n")) {
				System.out.print("계속하겠습니까?(y/n) ");
				cont = sc.nextLine();
				if (cont.equals("n")) {
					continueProgram = false;
				}
			}
		}

		System.out.println("--------프로그램 종료--------");
		for (int i = 0; i < desks.size(); i++) {
			Seat desk = desks.get(i);
			System.out.println(i + "번 예약정보");
			System.out.println(desk);
		}
	}

	// 로그인
	static User login() {
		System.out.println("--------로그인--------");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		for (User user : users) {
			if (user.getName().equals(name)) {
				System.out.print("핸드폰 번호 뒷자리 입력 : ");
				String phone = sc.nextLine();

				if (user.getPhone().equals(phone)) {
					return user;
				} else {
					System.out.println("로그인 정보가 틀렸습니다.");
					return null;
				}
			}
		}

		System.out.println("존재하지 않는 사용자입니다.");
		return null;
	}

	// 예약
	static void reserve(User user) {
		// 예약하려는 날짜, 시간의 좌석 번호 선택
		int deskIndex = user.selectDesk(desks);

		// 예약번호 예외 처리
		while (deskIndex < 0 || deskIndex >= desks.size()) {
			System.out.println("잘못된 예약 번호입니다.");
			deskIndex = user.selectDesk(desks);
		}

		// 선택된 날짜, 시간의 좌석 찾아서 예약
		Seat selectedDesk = desks.get(deskIndex);
		selectedDesk.reserve(user);
	}

}
