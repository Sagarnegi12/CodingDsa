package javaexamples.dsa.conditional;

import java.util.Scanner;

public class CheckPrime {

	private boolean IsPrime(int num) {
		
		int count=1;
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
		return true;
		
		}
		else
		{
		return false;
	}
	}
	
	
	private boolean IsArmstrong(int num)
	{
		int originalnum=num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			num=num/10;
			sum+=digit*digit*digit;
			}
		if(sum==originalnum)
		{
			return true;
		}else
		{
		return false;
		}
		
	}
	
	public static void main(String[] args) {

		CheckPrime cp= new CheckPrime();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		boolean ans=cp.IsPrime(sc.nextInt());
		System.out.println("The number you entered is prime ?" +ans);
		
		
	System.out.println("To check all the two digit armstrong number");
	
	for(int i=100;i<1000;i++)
		{
		
		if(cp.IsArmstrong(i))
		{
			System.out.println(i);
		}
		
	}

	}



}
