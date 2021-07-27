package com.lti.exception;

public class ExceptionMain2 {

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
		} catch (Exception e) {//has to be written in the end because this exception is very powerful and can handle all types of exception
			System.out.println(e.getMessage());
		}
		System.out.println("Main ends");
	}

}
