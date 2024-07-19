package com.dsa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {
	public static void main(String as[])
	{//get even elements from list
		List<Integer> list1=List.of(2,4,50,21,22,67); //immutable
		int sum=0;
//		Stream<Integer>stream=list1.stream();
//		stream.forEach(i->sum+=i);
		
		//filter(Predicate)
//		predicate is boolean value function
//		e->e>10
		
		//map(function)
		List<String> names=List.of("Cena","Paul","Roman","CM");
		List<String> cnames=names.stream().filter(e->e.startsWith("C")).collect(Collectors.toList());
		System.out.println(cnames);
		List<Integer> nums=List.of(23,4,5,6,1,2);
		List<Integer> squares=nums.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(squares);
		names.stream().forEach(
				e->{
					System.out.println(e);
				}
			);
		System.out.println("short way");
		names.stream().forEach(System.out::println);
		nums.stream().sorted().forEach(System.out::println);
		Integer integer=nums.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min: "+integer);
		Integer max=nums.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("max: "+max);
	}
}
//Write a Java program to calculate the average of a list of integers using streams.