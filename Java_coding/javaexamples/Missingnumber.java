package javaexamples;

import java.util.Arrays;

public class Missingnumber {

	public int Findnumber(int number[])
	{
		
		Arrays.sort(number);
		
		for(int i=0;i<=number.length;i++)
		{
		boolean isfound=false;
			for(int j=0;j<number.length;j++)
			{
				
					if(number[j]==i)
					{
					
				isfound=true;
				break;
					
			}
		}
		if(!isfound)
		{
			
		return i;
		
		}
		}
			return-1;
		
	}
	
	public int Findnumber2(int num2[])
	{
		int n=num2.length;
		  int min = num2[0];
		    int max = num2[0];
		
		 for (int i = 1; i < n; i++) {
		        if (num2[i] < min) {
		            min = num2[i];
		        }
		        if (num2[i] > max) {
		            max = num2[i];
		        }
		    }
		    
		    // Calculate the expected sum of numbers from min to max
		    int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;
		
		int currentsum=0;
		
		for(int k=0;k<num2.length;k++)
		{
			currentsum+=num2[k];
			
		}
		
	
		
		return expectedSum-currentsum;
	}
		
	
	public static void main(String[] args) {
		
		int [] num= {0,1,4,5,3,6,7,8,9};
		
		int [] num2= {5,6,7,11,9,12,10};
	
		Missingnumber ms=new Missingnumber();
		
		int ans=ms.Findnumber(num);
		
		int ans2=ms.Findnumber2(num2);

		System.out.println("missing number is "+ans);
		
		
		System.out.println("missing number is two "+ans2);
		
		
	}

}
