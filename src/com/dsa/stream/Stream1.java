package com.dsa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String as[])
	{//get even elements from list
		List<Integer> list1=List.of(2,4,50,21,22,67); //immutable
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);//.....
		List<Integer> list3=Arrays.asList(1,2,3,4,5,60);
		//using stream
		Stream<Integer> stream=list1.stream();
		List<Integer> newlist1=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist1);
		List<Integer> newlist2=list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println(newlist2);
	}
}
//Write a Java program to calculate the average of a list of integers using streams.