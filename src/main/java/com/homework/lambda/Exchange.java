package com.homework.lambda;

import java.util.Scanner;

public class Exchange {

	private static double EUR_HUF = 306.0;

	public static void ExchangeLambda() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		// try {
		System.out.println("Give me a number in HUF, I exchange it to EUR:");
		double huf = Double.parseDouble(sc.nextLine());
		sc.close();
		// } catch (NumberFormatException ex) {
		// System.out.println("Input Error - Please give number next time.");
		// }

		ExchangeInterface<Double> eur = (a, b) -> huf * EUR_HUF;
		// double e = (huf, EUR_HUF) -> huf*eur_huf;
		System.out.println(huf + " HUF = " + eur.toString() + " EUR");
	}
}
