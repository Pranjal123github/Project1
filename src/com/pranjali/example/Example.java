package com.pranjali.example;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		List<String> list = ex.listOfTopic();
		List<String> list2=ex.listOfTopic2();
		System.out.println(list);
<<<<<<< HEAD
=======
		List<String> list2 = ex.listOfTopic2();
>>>>>>> task1
		System.out.println(list2);
	}

	public List<String> listOfTopic() {
		List<String> list = new ArrayList<>();
		list.add("Core Java");
		list.add("Collection Freamework");
		System.out.println("Pranjali");
		list.add("MYSOL");
		list.add("Hibernate");
		list.add("Mysql");
		list.add("Array");
		list.add("HTML/CSS");
		list.add("Git");
		list.add("Converter");
		System.out.println(list);
		return list;
	}
	public List<String> listOfTopic2() {
		List<String> list = new ArrayList<>();
		list.add("Core Java");
		System.out.println(list);
		return list;
	}
	

}
