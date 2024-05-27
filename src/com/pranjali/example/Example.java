package com.pranjali.example;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		List<String> list = ex.listOfTopic();
		List<String> list2=ex.listOfTopic2();
		System.out.println(list);
		System.out.println(list2);
	}

	public List<String> listOfTopic() {
		List<String> list = new ArrayList<>();
		list.add("Core Java");
		list.add("Collection Freamework");
		list.add("SQL");
		list.add("Git");
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
