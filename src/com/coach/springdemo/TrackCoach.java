package com.coach.springdemo;

public class TrackCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}
	
	public TrackCoach() {
		
	}
	
	// add an init method
	public void doStartup() {
		System.out.println("TrackCoach: inside method doStartup");
	}
	
	public void doCleanup() {
		System.out.println("TrackCoach: inside methos doCleanup");
	}
	
}



