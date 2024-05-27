package com.pranjali.example;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		List<String> list = ex.listOfTopic();
		System.out.println(list);
	}

	public List<String> listOfTopic() {
		List<String> list = new ArrayList<>();
		list.add("Core Java");
		list.add("Collection Freamework");
		list.add("SQL");
		list.add("HTML/CSS");
		list.add("Git");
		System.out.println(list);
		return list;
	}

}
