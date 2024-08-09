package studyroomReservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class GroupSeat extends Seat {
	int numberOfSeat;

	public GroupSeat(int id, LocalDateTime dateTime, int numberOfSeat) {
		super(id, dateTime);
		this.numberOfSeat = numberOfSeat;
	}

	@Override
	void reserve(User user) {
		if (this.isReservated()) {
			System.out.println("이미 예약된 좌석입니다.");
		} else {
			this.setReservated(true);
			this.setUser(user);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH시");
			System.out.println(this.getDateTime().format(formatter) + " " + this.getId() + "번 그룹 좌석이 예약이 완료되었습니다.\n");
		}
	}

	@Override
	public String toString() {
		String[] messages = super.toString().split("\n");
		String message = "단체석\n" + messages[0] + "\n" + messages[1] + "\n" + "좌석 수 : " + numberOfSeat + "\n" + messages[2] + "\n";
		return message;
	}

}
