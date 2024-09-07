package javaexamples;

import java.util.Arrays;

public class SquareofSortedArray {

	public int [] SquareArray(int [] arr)
	{
      int start=0,end=arr.length-1;
      int ptr=arr.length-1;
      int [] squarearray=new int[arr.length];
      
      while(start<=end)
      {
    	  int ss=arr[start]*arr[start];
    	  int es=arr[end]*arr[end];
    	  if(ss>es)
    	  {
    		squarearray[ptr]=ss;
    		start++;
    		  
    		  
    	  }else
    	  {
    		  squarearray[ptr]=es;
    	  end--;
    	  }
    	  
    	  ptr--;
    	  
      }
		
		
		return squarearray;
	}
	
	public static void main(String[] args) {
		
		SquareofSortedArray sqr= new SquareofSortedArray();
		
		int [] arr= {-7,-4,3,0,1,2};
		
		int [] ans=sqr.SquareArray(arr);

		System.out.println("The sorted array square is "+Arrays.toString(ans));
	}

}
