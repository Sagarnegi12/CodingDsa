package javaexamples;

import java.util.HashSet;
import java.util.Set;

public class Containsduplicate {
	
	public boolean duplicate(int arr[])
	{
		Set<Integer> unique = new HashSet<>();
		
		for (int i=0;i<arr.length;i++)
		{
			if(unique.contains(arr[i]))
			{
				return true;
			}
					unique.add(arr[i]);
		}
		
		return false;
		
		
	}

	public static void main(String[] args) {
		
		Containsduplicate n =new Containsduplicate();
		
		int [] num1= {1,2,3,4,5};

		
		int [] num2= {1,2,2,4,5,6,6};
		
		boolean result=n.duplicate(num1);
		
		System.out.println("Does nums1 have duplicates?  "+result);
		
		result=n.duplicate(num2);
		
		System.out.println("Does nums2 have duplicates? " + result);
		
	}

}
