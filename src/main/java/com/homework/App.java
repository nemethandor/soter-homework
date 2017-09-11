package com.homework;

import com.homework.lambda.Exchange;
import com.homework.lambda.SuperHeroes;
import com.homework.stream.PeopleStatistics;
import com.homework.stream.StreamEven;

public class App {
	public static void main(String[] args) {

		System.out.println();
		Exchange.ExchangeLambda();

		System.out.println("");
		System.out.println("Method references példa:");
		SuperHeroes sh = new SuperHeroes();
		sh.MethodReferencesHW().forEach(System.out::println);

		StreamEven.whichNumbersAreEven();

		PeopleStatistics peopleStatistics = new PeopleStatistics();
		// Filter persons with IQ level above 100
		System.out.println("People with IQ above 100: \n" + peopleStatistics.getPersonsWithHighIQ());
		System.out.println();
		// IntSummaryStatistics
		System.out.println("IQ Summary Statistics: \n" + peopleStatistics.getSummaryStatistic());
		System.out.println();
		// Map the persons
		System.out.println("Here are the persons by IQ: \n" + peopleStatistics.mapThePeople());
	}
}
