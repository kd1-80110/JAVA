package com.sunbeam;

import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		Stream<Integer> strm = Stream.iterate(1, x -> x + 1)
				.limit(6);
		Integer fact = strm.reduce(1, (a,e) -> a * e);
		System.out.println("FACTORIAL : " + fact);

	}

}
