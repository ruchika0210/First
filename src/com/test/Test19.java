package com.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;


public class Test19 {

	public static void main(String[] args) {
	
		Stream.of("java","XML","CSS")
		 .map(n -> n.chars())
		 .flatMap(intStream -> intStream.mapToObj(k -> (char)k))
		 .forEach(System.out::print);
		
	}
}
