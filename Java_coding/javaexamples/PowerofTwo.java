package javaexamples;

import java.util.Scanner;

public class PowerofTwo {
  
	public boolean IsPowerofTwo(int num)
 {
		if(num<1)
		{
			return false;
		}
		if(num==1)
		{
			return true;
		}
		while(num%2==0)
		{
			num=num/2;
		}
			if(num==1)
			{
				return true;
			}
			else
			{
				return false;
			}
 }
	
	
	public static void main(String[] args) {
		
		PowerofTwo pt=new PowerofTwo();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
	boolean answer=pt.IsPowerofTwo(num);

	System.out.println("The number you entered is power of two ? " +" "+answer);
	
	}

}
