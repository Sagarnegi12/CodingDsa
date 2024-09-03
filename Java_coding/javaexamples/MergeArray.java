package javaexamples;

import java.util.Arrays;

public class MergeArray {
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Create a new array to hold both arrays' elements
        int[] mergedArray = new int[n1 + n2];

        // Copy both arrays into the mergedArray
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        // Sort the merged array
        Arrays.sort(mergedArray);

        return mergedArray;
    }

	
	private double calmedian(int[] num, int[] num1) {
		 int mergearray[]=new int[num.length+num1.length];
		 
		 int p=0,q=0,r=0;
		 
		 double ans=0.0;
		 
		 while(p<num.length || q<num1.length)
		 {
			 int val1= p<num.length ? num[p]:Integer.MAX_VALUE;
			 int val2= q<num1.length ?num1[q]:Integer.MAX_VALUE;
			 
			 if(val1<val2)
			 {
				 mergearray[r]=val1;
				 p++;
			 }else
			 {
				 mergearray[r]=val2;
				 q++;
				 
				 
			 }
			 
			 r++;
		 }
		 
		 int mergelength=mergearray.length;
		 
		 if(mergelength %2 ==0)
		 {
			 
			  ans=(mergearray[mergelength/2]+mergearray[mergelength/2-1])/2.0;
		 }else
			 ans=(mergearray[mergelength/2])/2;
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		MergeArray mg=new MergeArray();
		
		int [] num= {1,4,7,9};
		int [] num1= {2,3,6,8};
		
		double median=mg.calmedian(num,num1);
		
		 int [] merged=mg.mergeSortedArrays(num,num1);
		 
		 System.out.println("The merged array is"+Arrays.toString(merged));
		
		System.out.println("The median is "+median);

	
	}

}
