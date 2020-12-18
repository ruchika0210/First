package com.test;


import java.util.Random;
import java.util.stream.DoubleStream;

//import com.sun.jdi.Value;

public class Test11 {

	public static void main(String[] args) {
	
		DoubleStream.generate(new Random()::nextLong).limit(10).forEach(System.out::println);
				

	}

}

