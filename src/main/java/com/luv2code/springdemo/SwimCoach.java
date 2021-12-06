package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}



	public String getTeam() {
		return team;
	}



	public String getDailyWorkout() {
		return "Swim 1000 metrs as a warm up.";
	}

	public String getDailyFortune() {
		return fortuneService.getFurtune();
	}

}
