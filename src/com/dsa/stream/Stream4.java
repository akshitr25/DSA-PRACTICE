package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String as[])
	{
		List<Integer> list1=List.of(2,4,50,21,22,67); //immutable
//		int sum=0;
		double avg=list1.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average: "+avg);
	}
}
//Write a Java program to calculate the average of a list of integers using streams.