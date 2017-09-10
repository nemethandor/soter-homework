package com.homework;

import com.homework.lambda.Exchange;
import com.homework.lambda.SuperHeroes;

public class App {
	public static void main(String[] args) {
		
		
		System.out.println();
		Exchange.ExchangeLambda();
		
		System.out.println("");
		System.out.println("Method references példa:");
		SuperHeroes sh = new SuperHeroes();
		sh.MethodReferencesHW().forEach(System.out::println);
	}
}
