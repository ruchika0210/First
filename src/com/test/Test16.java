package com.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;

//import com.sun.jdi.Value;

public class Test16 {

	public static void main(String[] args) {
   int sum1 = Stream.of(1,2,3,4,5,6,7).peek(n -> System.out.println("taking number " + n)).filter(s -> s%2 ==0).peek(k -> System.out.println("adding number " + k)).reduce(0, Integer::sum);
   
  System.out.println("SUM  " + sum1);
		

 
	}

}
