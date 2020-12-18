package com.test;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import com.sun.jdi.Value;

public class Test13 {

	public static void main(String[] args) {
	
		String str = "1,2,3,ewe,4";
		str.chars().filter(n -> !Character.isDigit((char)n)).forEach(n -> System.out.println((char)n));
	}

}
