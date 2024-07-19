package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream6 {
	public static void main(String as[])
	{//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8); //immutable
		int evensum=list1.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(evensum);
		int oddsum=list1.stream().filter(e->e%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println(oddsum);
	}
}
