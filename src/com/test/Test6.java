package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//import com.sun.jdi.Value;

public class Test6 {

	public static void main(String[] args) {
		OptionalInt str = IntStream.of(1,9,3,2,4).filter(n -> n%2 == 0 ).max();
		
		System.out.println(str);

	}

}
