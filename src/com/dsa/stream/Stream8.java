package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream8 {
	public static void main(String as[])
	{//Write a Java program to count the number of strings in a list that start with a specific letter using streams.
		List<String> list1=List.of("Cena","CM","Roman","Randy"); //immutable
		long count=list1.stream().filter(s->s.startsWith("R")).count();
		System.out.println(count);
	}
}
