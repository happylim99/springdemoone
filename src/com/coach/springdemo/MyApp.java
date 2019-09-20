package com.coach.springdemo;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author User
 *
 */
public class MyApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		//System.out.println(theCoach.getDailyFortune());
		
		//context.close();

	}

}
