package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		System.out.println("Main begins");
		int[] num = { 1, 2, 3 };
		int[] num1 = { 10, 20, 30, 40, 50 };
		try {
			System.out.println(num[0]);// exception occurred here and it directly jumps to catch block
			System.out.println(num1[9]);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Array is not initialized");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " position is not available.");
		} finally {
			System.out.println("Finally executed");// irrespective of anything finally block will always be executed
		} // finally block is used to close or free all the resources/connection
//custom exception 
		int age = 0;
		System.out.println("Enter your age:");
		age = new Scanner(System.in).nextInt();

		if (age < 0) {
			try {
				throw new NegativeAgeException("Age cannot be negative");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("you are " + age + " years old");
		}

		System.out.println("Main ends");
	}

}
