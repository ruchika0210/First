package com.test;

import java.util.Optional;

public class Test5 {

	public static void main(String[] args) {
		
		Optional<String> str = Optional.of(null);
		
		str.ifPresent(value -> System.out.print(str));
		
	}
	
}
