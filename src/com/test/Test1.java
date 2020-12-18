package com.test;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
    
		 List<Integer> arr = Arrays.asList(1,2,3,4,5);
		 int sum1 = arr.stream().filter(n -> n%2 == 1).map(n -> n*n).reduce(0, Integer::sum);
		System.out.println(sum1);
		
	}

}
