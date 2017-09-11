package com.homework.stream;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StreamEven {

	public static void whichNumbersAreEven() {

		List<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int x = 1;

		System.out.println("Give me an integer numbers. If you want to exit, press 0.");
		while (x > 0 || x < 0) {

			try {
				System.out.println("Give me the next number.");
				x = sc.nextInt();

			} catch (InputMismatchException ex) {
				System.out.println("FormatException - I can accept only Integer numbers.");
				break;
				// x=sc.nextInt();
			}
			numbers.add(x);
		}

		System.out.println("All numbers in ascending order");
		numbers.stream().filter(s -> s != 0).sorted().forEach(System.out::println);
		System.out.println();

		System.out.println("All EVEN numbers in ascending order");
		numbers.stream().filter(s -> s != 0).filter(s -> s % 2 == 0).sorted().forEach(System.out::println);
		System.out.println();

		// numbers.stream().average().ifPresent(System.out::println);

	}

}
