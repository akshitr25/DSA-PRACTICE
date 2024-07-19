package com.dsa.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream9 {
	public static void main(String as[])
	{//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
		List<String> list1=List.of("Cena","CM","Roman","Randy"); //immutable
		List<String> asc=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		List<String> desc=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
	}
}
