package com.luxoft.upskilling.retCalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetCalcApplication {
    /*
    What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
     */
	public static void main(String[] args) {
		SpringApplication.run(RetCalcApplication.class, args);
	}

}
