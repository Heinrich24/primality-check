package com.heinrich24;

import java.math.BigInteger;
import java.util.Scanner;

public class MyMain {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String n = scanner.nextLine();

		scanner.close();

		// Declare variable type
		BigInteger value = new BigInteger(n);

		// Declare boolean checker
		boolean primeValueCheck;

		// Logic to check if the value is a prime number
		primeValueCheck = value.isProbablePrime(1);

		// Logic that needs to be performed if the value is
		// a prime value or not
		if (primeValueCheck) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
