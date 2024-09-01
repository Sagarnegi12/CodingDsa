package javaexamples;

public class MergeArray {

	
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
		
		System.out.println("The median is "+median);

	
	}

}
