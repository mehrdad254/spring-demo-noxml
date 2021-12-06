package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(swimCoach.getDailyWorkout());
		
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println("Email: "+swimCoach.getEmail());
		
		System.out.println("Team: "+swimCoach.getTeam());

		context.close();
	}

}
