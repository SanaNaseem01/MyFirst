package com.lti.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class CollectionsDemo {

	public static void  main(String[] args) {
//		List<Student> students= new ArrayList<Student>();
//		students.add(new Student(1,"john",LocalDate.of(2000,04,12)));
//		students.add(new Student(2,"Mike",LocalDate.of(2001,05,13)));
//		students.add(new Student(3,"Kevin",LocalDate.of(2002,01,14)));
//		students.add(new Student(4,"Peter",LocalDate.of(2003,06,15)));
//
//		Student st=new Student(3,"Kevin", LocalDate.of(2002, 01, 14));
//		System.out.println(students.indexOf(st));
//		
//		List<Integer> nums= new ArrayList<Integer>();
//		nums.add(10);
//		nums.add(20);
//		nums.add(30);
//		nums.add(40);
//		
//		System.out.println(nums.indexOf(30));
//		
		Set<String> names =new HashSet<String>(); //unsorted elements be displayed, null is accepted once
//		//Set<String> names =new TreeSet<String>(); //sorted Elements be dispalyed , null not excepted if null -- null pointer exception will be raised.
		names.add(new String("John"));
		names.add(new String("Mary"));
		names.add(new String("Bob"));
		names.add(new String("Mark"));
		names.add(new String("Jesop"));
		names.add(null);
		
		System.out.println(names);
		System.out.println(names.contains("John"));
		System.out.println(names.remove("Bob"));
		System.out.println(names);
		names.add("Bob");
		System.out.println(names);
		
		//Map
		//Map<Integer, String> credentials= new HashMap<Integer,String>();
		Map<Integer, String> credentials= new TreeMap<Integer,String>();
		credentials.put(1001,"pass@111");
		credentials.put(1002,"pass@222");
		credentials.put(1003,"pass@333");
		credentials.put(1004,"pass@444");
		credentials.put(1005,"pass@666");
		credentials.put(1005,"pass@555");
		//credentials.put(null,"pass@555");  // null value not allowed in treemap
		
		System.out.println(credentials);
		
		//there are two ways we can convert Map into Set: 1. Entryset() 2.Keyset()
		
		Set<Entry<Integer, String>> entryset=credentials.entrySet();
		Iterator<Entry<Integer,String>> iterator=entryset.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> items =iterator.next();
			System.out.println(items.getKey()+ " "+ items.getValue());
		}
		
		Iterator<String> allNames= names.iterator();
		while(allNames.hasNext()) {
			String name= allNames.next();
			System.out.println(name);
		}
		
	}

}