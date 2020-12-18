package com.test;

import java.util.Optional;

public class Test4 {
public static void main(String[] args) {
	String str1 = null;
	try
	{
		Optional<String> str = Optional.of(null);
		if (str == null)
	   {
			System.out.println("tryBlock");
	   }
	}
	catch (NullPointerException nullPointer)
	{
		str1 = "testingPass";
	   //System.out.println("catchBlock");
	}
	System.out.println(str1);
}
}
