package com.al.practice;

public class PrimeNumber {
	public static void main(String args[]) {
		
		boolean isPrime = true;
		
		int inputNumber = 9;
		int m = inputNumber / 2; //any number is not divisible by more than its half 
		
		
		for (int i = 2; i <= m; i++) {
			System.out.println("Value of i: "+i);
			if (inputNumber % i == 0) {
				isPrime = false;
				System.out.print(inputNumber + " is not prime");
				break;
			}
		}
		
		if (isPrime) {
			System.out.print(inputNumber + " is a prime number");
		}

	}

}
