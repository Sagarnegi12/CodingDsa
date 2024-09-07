package javaexamples;

import java.util.Arrays;

public class ArrayProductExceptItself {
	
	public int [] ProductArray(int [] arr)
	{
		int [] left=new int[arr.length];
		
		int [] right =new int [arr.length];
		
		
		int [] product=new int[arr.length]; 
		
		 left[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			left[i]=left[i-1]*arr[i-1];
			
		}
		
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=right[i+1]*arr[i+1];
		}
		
		for(int j=0;j<arr.length;j++)
		{
			product[j]=left[j]*right[j];
		}
		return product;
	}

	public static void main(String[] args) {
		
		ArrayProductExceptItself p =new ArrayProductExceptItself();
		
		int [] arr= {3,4,6,1,2};
		
	 System.out.println("The product of the array except iteself is"+Arrays.toString(p.ProductArray(arr)));

	}

}
