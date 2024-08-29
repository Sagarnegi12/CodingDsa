package javaexamples;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		 
		String str1="Silent";
		
		String str2="ilents";
		
		  str1 = str1.toLowerCase();
	      str2 = str2.toLowerCase();
		

		str1.replace(" ", "");

		
		str2.replace(" ", "");
		
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
       if(str1.length() != str2.length())
		{
			System.out.println("The strings are not Anagram");
			return;
		}
		
       
       for(int i=0;i<s1.length;i++)
		{
		if(s1[i] !=s2[i])
		{
			System.out.println("They are not anagram");
			return;
		}
		}
			System.out.println("They are Anagram");
			
		}

}
