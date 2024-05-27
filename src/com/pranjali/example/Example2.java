package com.pranjali.example;

import java.util.LinkedList;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		Example2 ex = new Example2();
		List<String> list = ex.listOfTopic();
		System.out.println(list);
	}

	public List<String> listOfTopic() {
		List<String> list = new LinkedList<>();
		list.add("Core Java");
		list.add("Collection Freamework");
		list.add("Hibernate");
		list.add("JDBC");
		list.add("Git");
		list.add("Converter");
		return list;
	}

}
