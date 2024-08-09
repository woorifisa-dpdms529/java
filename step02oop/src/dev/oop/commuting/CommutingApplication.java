package dev.oop.commuting;

import java.time.Duration;
import java.time.LocalDateTime;

import dev.oop.commuting.model.*;

public class CommutingApplication {
	public static void main(String[] args) {
		Student jsYoon = new Student("정성윤", 20000);
//		jsYoon.name = "정성윤";
//		jsYoon.balance = 20000;
		jsYoon.printInfo();
		
//		Bus bus = new Bus(100);
//		bus.busNumber = 100;
		
		Transportation bus = new Bus(100, 1000);
		jsYoon.take(bus);
		
		Transportation subway = new Subway(200, 2000);
		jsYoon.take(subway);
		
		long du = Duration.between(LocalDateTime.of(2024, 8,8,18,0,0), LocalDateTime.of(2024, 8,8,22,0,0)).getSeconds()/60/60;
		System.out.println(du);
		
	}
}
