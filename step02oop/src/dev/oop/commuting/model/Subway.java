package dev.oop.commuting.model;


/**
 * 지하철 클래스

2-1. 속성 Summary
지하철 번호 - int subwayNumber
지하철 승객 수 - int numberOfPassengers;
수익금 - int sales

2-1. 역할 Summary
지하철 손님 태우기 - take(int sales)
-> 요금 수령, 손님 숫자 증가

지하철 승객 수 확인 - printInfo()
출력 형식: subwayNumber 지하철의 승객은 총 numberOfPassengers 명 입니다.
 */

public class Subway extends Transportation{

	public Subway(int transportNumber, int fee) {
		super(transportNumber, fee);
	}

	@Override
	public void printInfo() {	
		System.out.printf("%d번 지하철의 승객은 %d명입니다.", this.transportNumber, this.numberOfPassengers);
	}
}










