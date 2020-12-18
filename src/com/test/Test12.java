package com.test;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;

//import com.sun.jdi.Value;

public class Test12 {

	public static void main(String[] args) {
	
     Set<String> str = new HashSet<String>();
     str.add("XML");
     str.add("XML");
     str.add("java");
     str.add("jquerz");
     str.add("sql");
     
     //str.parallelStream().forEach(System.out::println);
     str.forEach(System.out::println);

	}

}

