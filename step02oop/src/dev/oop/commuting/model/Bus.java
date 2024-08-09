package dev.oop.commuting.model;

public class Bus extends Transportation{

	public Bus(int transportNumber, int fee) {
		super(transportNumber, fee);
	}

	@Override
	public void printInfo() {	
		System.out.printf("%d번 버스의 승객은 %d명입니다.", this.transportNumber, this.numberOfPassengers);
	}

}
