package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String as[])
	{//get even elements from list
		List<Integer> list1=List.of(2,4,50,21,22,67); //immutable
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e->
		{System.out.println();});
		String names[]={"A","B","C","D"};
		Stream<String> stream1=Stream.of(names);
		stream1.forEach(e->{System.out.println(e);});
		Stream<Object> streamBuilder=Stream.builder().build();
//		Stream stream=(Stream)Arrays.stream(new int[]{1,2,3,4});
		IntStream intstream=Arrays.stream(new int[]{1,2,3,4});
		Stream<Integer> newstream=list1.stream();
		newstream.forEach(e->{System.out.println(e);});
	}
}
//Write a Java program to calculate the average of a list of integers using streams.