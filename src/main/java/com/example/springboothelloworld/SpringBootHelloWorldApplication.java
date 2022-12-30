package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		/*HelloWorld helloWorld=context.getBean(HelloWorld.class);
		helloWorld.printWish();
		PrintDateTime pdt=context.getBean(PrintDateTime.class);
		pdt.printDateTime();

		Test test=context.getBean(Test.class);
		test.displayPrintTestData();*/
		Traveller traveller=context.getBean(Traveller.class);
		traveller.startJourney();

	}

}
