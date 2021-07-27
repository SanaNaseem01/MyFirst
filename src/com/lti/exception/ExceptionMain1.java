package com.lti.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	// throws doesn't handle or resolves an exception. It just means developer is
	// taking the responsibility and is certain that this exception wont take place.
	// If an exception occours then exception isn't handled and program terminates
	// abnormally
	public static void main(String[] args) throws IOException { // caller should define exception as well
		System.out.println("Main begins");
		try {
			fileRead("D:\\docs\\bce.txt");
		} catch (Exception e) {
			System.out.println("File no found");
		}
		// TODO Auto-generated method stub

	}

	public static void fileRead(String fileName) throws IOException // FileNotFoundException
	{
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		char[] ch = new char[100];
		try {
			reader.read(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(ch);
	}
	// ----------------Multiple catch bolcks---------------------
}