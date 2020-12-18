package com.test;

import java.util.Arrays;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	List<Integer> arr = Arrays.asList(1,1,8,2,3,6,4,7,1,2,0,3);
     arr.stream().sorted().forEach(System.out::println);
}
}
