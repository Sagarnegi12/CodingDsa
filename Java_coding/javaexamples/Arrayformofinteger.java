package javaexamples;

import java.util.*;

public class Arrayformofinteger {

	
	public int [] Newsummeduparray(int num [],int toadd)
	{
		
		int sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum*10+num[i];
			
		}
		sum=sum+toadd;
		
		List <Integer> resultlist= new ArrayList<>(); 
		
	 while(sum>0)
	 {
		 int digit=sum%10;
		 resultlist.add(digit);
		 sum =sum/10;
		 
		 
	 }
	 
	 Collections.reverse(resultlist);
	 
		int ans []= new int[resultlist.size()];
		
		for(int i=0;i<resultlist.size();i++)
		{
			
			ans [i] = resultlist.get(i);
			
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
	
		
		Arrayformofinteger af=new Arrayformofinteger();
		
		int num []= {1,2,0,0};
		
		int toadd=34;
		
		int newnum []=af.Newsummeduparray(num,toadd);
		 for(int number:newnum)
		 {
			 
			 System.out.print(number +",");
		 }
		
	}

}
