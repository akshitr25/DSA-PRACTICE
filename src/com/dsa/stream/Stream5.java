package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream5 {
	public static void main(String as[])
	{//Write a Java program to convert a list of strings to uppercase or lowercase using streams.
		List<String> list1=List.of("abc","def","ghi","Adx"); //immutable
		List<String> upper=list1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		List<String> lower=list1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(lower);
	}
}
