package com.al.practice;

public class ReverseNumber {
	public static void main(String args[]) {
		int number = 10, reverse = 0;
		while (number > 0) {
			int remainder = number % 10;
			System.out.println("Remainder number is : " + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("Loop reverse number is : " + reverse);
			number = number / 10;
			System.out.println("Loop number is : " + number);

		}
		System.out.println("Reverse number is : " + reverse);
	}

}
