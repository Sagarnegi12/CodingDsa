package javaexamples;

public class Tribonacci_series {

	public static void main(String[] args) {
		
		int num=2;

		int fn=0;
		int sn=1;
		int tn=1;
		
		//the below code can work if we are making a function and returning value to it 
//		if(num<=0)
//		{ 
//			System.out.println(""+0);
//		}
//		if(num==1||num==2)
//		{
//			System.out.println(""+1);
//		}
		for(int i=1;i<=num;i++)
		{
			 if (i > 1) {
			        System.out.print(",");
			    }
			    System.out.print(fn);
			int fth=fn+sn+tn;
			fn=sn;
			sn=tn;
			tn=fth;
		}
	}

}
