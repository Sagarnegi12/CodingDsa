package javaexamples;

public class Stringpalindrome {

	public static void main(String[] args) {
		
		
		String str="madam",revstr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
		revstr+=str.charAt(i);	
		}
		
		if(str.equals(revstr))
		{
			System.out.println("It is a palindrome String");
		}
		else
		{
			
			System.out.println("It is not a plaindrome string ");
		}
	}

}
