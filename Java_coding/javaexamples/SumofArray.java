package javaexamples;

import java.util.Arrays;

public class SumofArray {
	
	public int [] Arrayindices(int num[],int target)
{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				
				if(num[i]+num[j]==target)
					
					return new int [] {i,j};
			}
			
		}
		throw  new IllegalArgumentException("No two numbers add up to the target");
		
}
	public static void main(String[] args) {
		
		SumofArray sum=new SumofArray();
	
		int arr[]= {1,2,3,5,6,7};

		int target =7;
		
		int result []=sum.Arrayindices(arr,target);
		
		System.out.println("The array indices are"+Arrays.toString(result));
		
	}

}
