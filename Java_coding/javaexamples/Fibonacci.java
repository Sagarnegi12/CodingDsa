package javaexamples;

public class Fibonacci {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8
		
		int num=10;
		int fn=0;
		int sn=1;
		
		for (int i=0;i<=num;++i)
		{
       System.out.print(fn+"  ");
       int nextnum=fn+sn; //1
       fn=sn;   //1
       sn=nextnum; //1
	}

}
}
