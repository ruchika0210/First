package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.jdi.Value;

public class Test8 {

	public static void main(String[] args) {
	
		Stream<String> str = Stream.<String>builder()
				.add("XML")
				.add("java")
				.add("jquerz")
				.build();
		str.forEach(System.out::println);
				

	}

}
