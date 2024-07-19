package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream7 {
	public static void main(String as[])
	{//Write a Java program to remove all duplicate elements from a list using streams.
		List<Integer> list1=List.of(1,1,1,2,2,2,2,3,4,4,4,4,5,6,7,8); //immutable
		List<Integer> distinct=list1.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
	}
}
