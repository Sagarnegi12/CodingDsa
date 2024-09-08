package javaexamples;

public class Max_SubarraySum {

	public static void main(String[] args) {
		
		int [] num= {-2,-5,6,-2,-3,1,5,-6};
		
		int max_so_far=num[0];
		int cur_max=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			cur_max=Math.max(num[i],num[i]+cur_max );
			
			max_so_far=Math.max(cur_max, max_so_far);
			
		}
System.out.println("The maximun sum of the subarray is"+max_so_far);
	}

}
