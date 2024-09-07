package javaexamples;

import java.util.Arrays;

public class TwoSum {
	public int [] Calsum(int arr[],int target)
	{
	
	int start=0,end=arr.length-1;
	int i,j;
	
	while(start<=end)
	{
		int ss=arr[start]+arr[end];
		if(ss==target)
		{
			return new int[] {start+1,end+1};
			
		}else if(ss<target)
		{
			start++;
		}else
			end--;
	}
	throw  new IllegalArgumentException("No two numbers add up to the target");

	}
//	public int [] Calsum(int arr[],int target)
//	{
//		int i,j;
//		
//		for(i=0;i<=arr.length;i++)
//		{
//			for(j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]+arr[j]==target)
//				return new int [] {i+1,j+1};
//				
//			}
//		
//		}
//		
//		throw new IllegalArgumentException("Two number dont add upto to target");
//	}

	public static void main(String[] args) {
		
		TwoSum ts=new TwoSum();
		
		int arr[]= {2,7,11,15};
		
		int target=9;
		
		int ans []=ts.Calsum(arr,target);
		
		System.out.println(""+Arrays.toString(ans));

	}

}
