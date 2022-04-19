package com.lambdaAndStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAndLambda {

	public static void main(String[] args) {
//		 List <Integer> orig = List.of(22,23,76,44,45,66);
		// collection
		List<Integer> orig = new ArrayList<Integer>();
		orig.add(88);
		orig.add(56);
		orig.add(22);
		orig.add(64);
		orig.add(78);
		orig.add(35);
		orig.add(43);
		System.out.println(orig);

//		conventional way of programming

//		List<Integer> evenList = new ArrayList<Integer>();
//		for (Integer i : orig) {
//			if (i % 2 == 0) {
//				evenList.add(i);
//			}
//		}
//		System.out.println(evenList);

//		stream API
		Stream<Integer> stream = orig.stream();
		List<Integer> l = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l);

//		if we want to count
//		filter is used when we want to process in some object.
		long fail = l.stream().filter(i -> i < 33).count();
		System.out.println(fail);

//		if we do not want to use filter,,,,
//		map is used when we want to process on every object
		List<Integer> updateList = orig.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updateList);
	}

}
