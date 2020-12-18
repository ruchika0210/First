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

//import com.sun.jdi.Value;

public class Test18 {

	public static void main(String[] args) {
	
		IntStream.range(1, 5).map(n -> n*n).forEach(System.out::println);
		
	}
}
