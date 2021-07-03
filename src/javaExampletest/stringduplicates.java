package javaExampletest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class stringduplicates {

	public static void main(String[] args) {
			
		String strg = "hiiiittttoooddaayyyyy";
		duplicatesinString(strg);

	}

	private static void duplicatesinString(String strg) {
		
		char ch[] = strg.toCharArray();
		String []l=strg.split(" ");
		
		List<String> word = new ArrayList<>();
		HashMap<Character,Integer> maap = new HashMap<Character, Integer>();
		for(char ch1 : ch) {
			if(maap.containsKey(ch1))
				maap.put(ch1 , maap.get(ch1)+1);
			else
				{maap.put(ch1, 1);
				word.add(Character.toString(ch1));}
		}
		System.out.println(maap);
		System.out.println(word);
//		for(String f : word) {
//			if(maap.containsKey(f)) {
//				System.out.println(f+" : "+maap.get(f));
//			}
//		}
		String d = maap.toString();System.out.println(d);
		System.out.println(("\n"));
//-------------------------------------------------------------------------------------------------------------	
		String f= "what is what can be declare in the final match ok what";
		String []word1 = f.split(" ");
		HashMap<String, Integer> Mwords = new HashMap<String, Integer>();
		
		for(String o : word1) {
			if(Mwords.containsKey(o))
				Mwords.put(o, Mwords.get(o)+1);
			else
				Mwords.put(o, 1);
			}
		 Set<String> q = Mwords.keySet();
		 System.out.println(q);
		for(String g : q) {
			if(Mwords.get(g)>1)
				System.out.println(g+":"+Mwords.get(g));
			
		
		}
		//System.out.println(Mwords);
		
	}

}
