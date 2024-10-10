package javaexamples.dsa.conditional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perfect_number {
	
	public void Sum_of_number(List<Integer> num)
	{
		 int sumNegative = 0;
	        int sumPositiveEven = 0;
	        int sumPositiveOdd = 0;
	        for(int n:num)
	        {
	        	if(n<0)
	        	{
	        		sumNegative+=n;
	        	}
	        	else if(n>0)
	        	{
	        		if(n%2==0)
	        		{
	        			sumPositiveEven+=n;
	        		}
	        		else
	        		{
	        			sumPositiveOdd+=n;
	        		}
	        		
	        	}
	        	
	        	
	        }
	        
	        System.out.println("The sum of positive Even number is "+sumPositiveEven);
	        System.out.println("The sum of positive odd number is "+sumPositiveOdd);
	        System.out.println("The sum of negative  number is "+sumNegative);
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int sum=0;
//		
//		while(true)
//		{
//		
//		System.out.println("Enter a number");
//		
//		int num=sc.nextInt();
//		
//		 if(num==0)
//		 {
//			 System.out.println("Exiting");
//			 break;
//			 }
//		 
//		for(int i=1;i<=num/2;i++)
//		{
//		if(num%i==0)
//		{
//			sum+=i;
//			
//		}
//		}
//		
//		if(sum==num)
//		{
//			System.out.println("The number "+num+" is a perfect number");
//		}else
//		{
//			System.out.println("The number " +num+" is not a perfect number");
//		}
//		}
		
		int num1;
		
		Perfect_number n1=new Perfect_number();
		 
		List<Integer> list=new ArrayList<>();
		
		while(true)
		 {
			 
		 num1=sc.nextInt();
			 if(num1==0)
			 {
				 System.out.println("Exiting");
			 break;
			 }
				 
		 list.add(num1);
		 }
		 n1.Sum_of_number(list);

		sc.close();
	
}

}
