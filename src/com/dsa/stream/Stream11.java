package com.dsa.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream11 {
	public static void main(String as[])
	{//Write a Java program to find the second smallest and largest elements in a list of integers using streams.
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9,10); //immutable
		Integer secondsmallest=list1.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondsmallest);	
		Integer secondlargest=list1.stream().distinct().sorted((a,b)->Integer.compare(b, a)).skip(1).findFirst().orElse(null);
		System.out.println(secondlargest);	
	}
}
