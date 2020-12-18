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


public class Test21 {

	public static void main(String[] args) {
	
	List<Integer> sum1 = Arrays.asList(1,2,2,3,5,6,9);
	int sum = sum1.stream().reduce(0,Integer::sum);
		System.out.print(sum);
	}
}
