package javaexamples;

public class RemoveElement {

	private int Remove(int [] num,int val)
	{
		
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=val)
			{
				num[count]=num[i];
				count++;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		
		RemoveElement rm=new RemoveElement();
		int [] arr= {0,2,3,4,5,6,2,6,4,2,8};
		
		int valremove=2;
		
		int k= rm.Remove(arr,valremove);
		
		System.out.println(k);

	}

}
