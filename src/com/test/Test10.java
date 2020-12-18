package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.jdi.Value;

public class Test10 {

	public static void main(String[] args) {
	
		IntStream.iterate(10, n -> n+1).limit(10).forEach(System.out::println);
				

	}

}
