package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.jdi.Value;

public class Test7 {

	public static void main(String[] args) {
	
		Stream<String> str = Stream.of("tryBlock","tryBlock2","tryBlock3","tryBlock4");
		str.forEach(System.out::println);

	}

}
