package javaexamples;

public class NonRepeatingElement {

	public static void main(String[] args) {
		
		int [] arr= {1,2,1,4,5,4,6,8,9,9,8,2,6};
		
		for(int i=0;i<arr.length;++i)
		{
			int x=arr[i];
			int count=0;
			for(int j=0;j<arr.length;++j)
			{
				if(arr[j]==x)
				{
					++count;
				}
				
                 
}
			if(count==1)
			{
				System.out.println("The non repeating element is "+arr[i]);
			}
			
		}

	}

}
