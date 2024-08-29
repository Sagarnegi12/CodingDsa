/**
 * 
 */
package javaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupedAnagram {
	
	public List<List<String>> groupanagram(String [] inputstring)
	{
		Map<String,List<String>> anagram=new HashMap<>();
		
		for(String str1:inputstring)
		{
			
			char [] ch=str1.toCharArray();
			
			Arrays.sort(ch);
			
			String sorted =String.valueOf(ch);
			
			if(!anagram.containsKey(sorted))
			{
				anagram.put(sorted, new ArrayList());
			}
			
			anagram.get(sorted).add(str1);
		}
		
		return new ArrayList<>(anagram.values());
		
	}
	
	
	public static void main(String[] args) {
		
		GroupedAnagram ga=new GroupedAnagram();
     
		String [] str= {"act","pots","tops","cat","stop","hot"};
		  
		System.out.println(ga.groupanagram(str));
		

	}

}
