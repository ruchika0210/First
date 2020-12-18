package com.test;
import java.util.Optional;

public class Test3 {

	public static void main(String[] args) {
		Optional<String> str = Optional.of("Stringjhjhjhj");
		System.out.println(str);
		Optional<String> str1 = Optional.empty();
		System.out.println(str1);
		
		String str2 = "";
		Optional<String> str3 = Optional.of(str2);
		System.out.println(str3);
	}
}
