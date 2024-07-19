package com.dsa.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream10 {
	public static void main(String as[])
	{//Write a Java program to find the maximum and minimum values in a list of integers using streams.
		List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9,10); //immutable
		Integer max1=list1.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max1);
		Integer min1=list1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(min1);
		Integer max2=list1.stream().max(Integer::compare).orElse(null);
		System.out.println(max2);
		Integer min2=list1.stream().min(Integer::compare).orElse(null);
		System.out.println(min2);	
	}
}
