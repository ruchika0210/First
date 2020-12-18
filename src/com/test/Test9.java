package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.jdi.Value;

public class Test9 {

	public static void main(String[] args) {
	
		IntStream str = IntStream.rangeClosed(1, 10);
		str.forEach(System.out::println);
				

	}

}
