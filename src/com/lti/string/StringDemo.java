package com.lti.string;

public class StringDemo {

	public static void main(String[] args) {
		String str1=new String("LTI");
		String str2=new String("LTI");
		
		 
		//System.out.println(str1==str2);  //checks the reference
		//System.out.println(str1.equals(str2)); //checks the values
		
		String str3="Simant";
		String str4="Simant";
		String str5=new String("Simant");
		
//		System.out.println(str3==str4);
//		System.out.println(str3.equals(str4));
//		
//		System.out.println(str3==str5);
//		System.out.println(str3.equals(str5));
		
		String str6=new String("Hello");
		String str7="Hello";
		System.out.println(str6==str7);
		System.out.println(str6.equals(str7));
		
		String str8="Hello";
		System.out.println(str7==str8);
		System.out.println(str7.equals(str8));
		
		str8="Simant";
		
		System.out.println(str4==str8);
		
		//---------------------------
	}

}
