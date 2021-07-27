package com.example.demo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside startup");
	}

	public void dyMyCleanUpStuff() {
		System.out.println("TrackCoach: inside cleanup");
	}


	// add a destory method

}










