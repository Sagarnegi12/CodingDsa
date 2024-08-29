package javaexamples;

public class WaterbottlesExchange {

	public int Newwaterbottles(int newbottles,int exchangebottles)
	{
		
		int ans=newbottles;
		while(newbottles>=exchangebottles)
		{
			int newbottlesfromexchange=newbottles/exchangebottles;
			
			
			int rembottles=newbottles%exchangebottles;
			
			ans+=newbottlesfromexchange;
			
			newbottles=newbottlesfromexchange+rembottles;
			
		}
		return ans;
		
	}
	public static void main(String[] args) {
		
		WaterbottlesExchange wb= new WaterbottlesExchange();
		
		int newbottles=15;
		int exchangebottles=3;
		
		System.out.println("Number of water bottles you can drink "+wb.Newwaterbottles(newbottles,exchangebottles));

	}

}
