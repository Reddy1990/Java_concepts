package com.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsCreation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Streams Creation
		// Streams will not modify its source

		// 1. Empty Stream
		// This can be used for creation of empty streams and sometimes in logic where
		// null
		// can be avoided
		Stream<String> emptyStream = Stream.empty();
		// 2. Stream from Collection
		Stream<String> collectionStream = Arrays.asList("Dave", "Doe", "Dan").stream();
		// 3. Stream from Array
		Stream<String> arrayStream = Stream.of("Dave", "Doe", "Dan");
		// or
		String[] arr = new String[] { "Dave", "Doe", "Dan" };
		Stream<String> arrayStream1 = Arrays.stream(arr);
		
		// 4. Stream.builder
		Stream<String>  builderStream =Stream.<String>builder().add("Dave").add("Doe").build();
		// 5. Stream.generate 
		// The below stream generates infinite stream untill it reaches out the memory limit , so the limit 
		// should be specified
		Stream<String> finiteStream = Stream.generate(()->"element").limit(10);
		// 6.Stream.iterate
		// Another way of creating an infinite stream is by using the iterate() method:
		// The first element of the resulting stream is a first parameter of the iterate() method.
		// For creating every following element the specified function is applied to the previous element.
		// In the example above the second element will be 20.
		Stream<Integer> iterateStream =Stream.iterate(20,n->n+2).limit(10); 
        // 7. Stream of Primities
		// IntStream, LongStream, DoubleStream.
		// range(int startInclusive, int endExclusive) 
		// rangeClosed(int startInclusive, int endInclusive)
		IntStream intStream = IntStream.range(1,3);
		LongStream longStream = LongStream.rangeClosed(1, 4);
		// 8. Stream from Random
		Random rand = new Random();
		DoubleStream doubleStream = rand.doubles(3);
		// 9. Stream from a String
		IntStream streamOfChars ="abc".chars();
		
		
		
	}

}
