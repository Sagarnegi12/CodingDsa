package javaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupString {

	public List<List<String>> groupedanagram(String str1[])
	{
		Map<String,List<String>> Anagram= new HashMap<>();
		
		for(String str:str1)
		{
			char [] ch=str.toCharArray();
			
			Arrays.sort(ch);
			
			String sorted= String.valueOf(ch);
			
			if(!Anagram.containsKey(sorted))
			{
				Anagram.put(sorted, new ArrayList<>());
			}
			
			Anagram.get(sorted).add(str);
		}
		
		return new ArrayList<>(Anagram.values());
		
	}
	
	public static void main(String[] args) {
		
		GroupString gs = new GroupString();
		
		String str[]= {"act","tact","silent","ilents","mot","tom"};
		
		System.out.println(gs.groupedanagram(str));

	}

}
