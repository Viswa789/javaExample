package javaExampletest;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test7 {

	public static void main(String[] args) {
		int sum = Arrays.stream(new int[]{1, 2, 3}) 
				  .filter(i -> i >= 2) 
				  .map(i -> i * 3) 
				  .sum();
		
		System.out.println(sum);
		
		List<Integer> k = Arrays.asList(2,3,4,5,6,7,8);
		
		Stream<Integer> a = k.stream().filter(i -> i >= 2)
				  .map(i -> i * 3);
		
		a.forEach(i->System.out.println(i));
	
		int y [] = {2,7,4,6,5};
		
		int s = Arrays.stream(y).filter(i -> i >= 2) 
				  .map(i -> i * 3) 
				  .sum();
		System.out.println(s);
		
		Map<String, List<String>> people = new HashMap<>(); 
		people.put("John", Arrays.asList("555-1123", "555-3389")); 
		people.put("Mary", Arrays.asList("555-2243", "555-5264")); 
		people.put("Steve", Arrays.asList("555-6654", "555-3242")); people.forEach((i,u)->System.out.println(i+" "+u));

		List<String> phones = people.values().stream() 
		  .flatMap(Collection::stream) 
		    .collect(Collectors.toList()); 
		phones.forEach(i->System.out.println(i));
		
		String h= "wertyui";
		h="ddff";
		System.out.println(h);
	}

}
