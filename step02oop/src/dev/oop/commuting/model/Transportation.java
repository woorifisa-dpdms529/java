package dev.oop.commuting.model;

public abstract class Transportation {
	protected int transportNumber;
	protected int numberOfPassengers;
	protected int sales;
	protected int fee;
	
	public Transportation(int transportNumber, int fee) {
		this.transportNumber = transportNumber;
		this.fee = fee;
	}

	public void take() {
		sales += fee;
		numberOfPassengers++;
		printInfo();
	};
	
	abstract public void printInfo();

	public int getTransportNumber() {
		return transportNumber;
	}

	public void setTransportNumber(int transportNumber) {
		this.transportNumber = transportNumber;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
}
