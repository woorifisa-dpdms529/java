package dev.oop.commuting.model;

public class Student {
	private String name;
	private int balance;
	
	public Student(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void take(Transportation transportation) {
		transportation.take();
		balance -= transportation.getFee();
		printInfo();
	}
	
	public void printInfo() {
		System.out.println(name + "님의 남은 돈은 " +  balance + "입니다.");
	}

}
