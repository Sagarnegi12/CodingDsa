package javaexamples;

import java.util.Arrays;

public class LargestinArray {

	private int Findindex(int[] num) {

		int max=num[0];
		int  smax=0;
		int index=-1;
		
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				smax=max;
				max=num[i];
				index=i;
				}else
					if(num[i]>smax)
					{
						smax=num[i];
					
					}
		}
			
			if(2*smax<=max)
			{
				return index;
			}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		LargestinArray lg= new LargestinArray();
		
		
		int [] num= {3,6,2,0,12};
		 
	int largestindex = lg.Findindex(num);
	
	System.out.println("The index of the largest number is "+largestindex);
		 
	}

	

}
