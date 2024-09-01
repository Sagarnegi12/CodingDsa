package javaexamples;

public class MaxoftwoElements {

	public int CalMaxProduct(int[] number)
	{
		int product=0;
		
		int max=0;
		int smax=0;
		
		for(int i=0;i<number.length;i++)
		{
			if(max<number[i])
			{
				smax=max;
				max=number[i];
				
				}
			else if(number[i]>smax)
			{
				smax=number[i];
			}
			
			}
		
		product=(max-1)*(smax-1);
		System.out.println("The maximum value is " +max+ " Second max is " +smax);
		return product;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		 MaxoftwoElements max= new MaxoftwoElements();
		 
		 int [] number= {3,4,5,2,8,6};
		 int maxproduct=max.CalMaxProduct(number);

		 
		 System.out.println("The product of the two values is "+maxproduct);
	}

}
