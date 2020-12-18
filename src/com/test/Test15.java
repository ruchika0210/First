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

public class Test15 {

	public static void main(String[] args) {
	 
		Path pt = Path.of(".");
		
		try(Stream<Path> str = Files.walk(pt) ) 
		{
			str.forEach(System.out::println);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

 
	}

}
