package javaexamples;

import java.util.Scanner;

public class Palindrome {

	public boolean Checkpalindrome(int num)
	{
		int temp=num;
		int revnum=0;
		
		while(temp>0)
		{
			int digit=temp%10;
			 
			revnum=revnum*10+digit;
			
			temp=temp/10;
			}
		
		if(num==revnum)
		{
		return true;
	}else
	{
		return false;
		}
	}
	
	public static void main(String[] args) {
		 
		Palindrome pd=new Palindrome(); 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		System.out.println("The number is a palindrome" +" "+pd.Checkpalindrome(num));

	}

}
