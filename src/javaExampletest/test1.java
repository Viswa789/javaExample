package javaExampletest;

import java.util.ArrayList;
import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		String s = "hhiiiitttoooodddaaaayy";
		countduplicates(s);
		String d ="there is a hope there is a way";
		checkduplicatewords(d);

	}

	private static void checkduplicatewords(String d) {
	
		HashMap<String, Integer > mp = new HashMap<String, Integer>();
		String[] stg = d.split(" ");
		for(String j : stg) {
			if(mp.containsKey(j))
				mp.put(j, mp.get(j)+1);
			else
				mp.put(j, 1);
		}
		mp.forEach((k,v)-> System.out.println(k+" : "+v));
	}

	private static void countduplicates(String s) {
		HashMap<String,Integer> mp = new HashMap<String, Integer>();
		ArrayList<String> g = new ArrayList<>();
		String[] strg = s.split("");
		
		for(String d : strg ) {
			if(mp.containsKey(d))
				mp.put(d, mp.get(d)+1);
			else
			{mp.put(d, 1);g.add(d);}
		}
		mp.forEach((k,v)->System.out.println(k+" : "+v));
		System.out.println(g);
	}

}
