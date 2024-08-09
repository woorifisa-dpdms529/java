package studyroomReservation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Seat {
	// 좌석 번호
	private int id;
	// 날짜 & 시간
	private LocalDateTime dateTime;
	// 예약 여부
	private boolean isReservated = false;
	// 예약자 정보
	private User user;

	public Seat(int id, LocalDateTime dateTime) {
		this.id = id;
		this.dateTime = dateTime;
	}

	// 예약
	abstract void reserve(User user);

	public int getId() {
		return id;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public boolean isReservated() {
		return isReservated;
	} 
	
	public void setReservated(boolean isReservated) {
		this.isReservated = isReservated;
	}

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		String reservationInfo = isReservated ? "예약완료" : "예약가능";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH시");
		String message = "날짜 시간 : " + dateTime.format(formatter) + "\n" + "좌석 번호:" + id + "\n" + reservationInfo + "\n";

		if (user != null) {
			message += "신청자 : " + user.getName() + "\n";
		}
		
		return message;
	}

}
