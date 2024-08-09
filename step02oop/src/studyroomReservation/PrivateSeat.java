package studyroomReservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrivateSeat extends Seat{

	public PrivateSeat(int id, LocalDateTime dateTime) {
		super(id, dateTime);
	}

	@Override
	void reserve(User user) {
//		if(user instanceof GroupUser) {
//			return;
//		}
		if (this.isReservated()) {
			System.out.println("이미 예약된 좌석입니다.");
		} else {
			this.setReservated(true);
			this.setUser(user);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH시");
			System.out.println(this.getDateTime().format(formatter) + " " + this.getId() + "번 개인 좌석이 예약이 완료되었습니다.\n");
		}
	}
	
	@Override
	public String toString() {
		String message = "개인석\n" + super.toString();
		return message;
	}

}
