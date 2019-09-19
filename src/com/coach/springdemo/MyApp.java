package com.coach.springdemo;

/**
 * @author User
 *
 */
public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());

	}

}
