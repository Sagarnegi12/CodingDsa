package javaexamples.dsa.conditional;
import java.util.*;

public class Area {

    double area;

  
    public void AreaCircle(int radius) {
        area = Math.PI * radius * radius;
        System.out.printf("The area of the circle is %.2f%n", area);
    }

  
    public void AreaTriangle(int length, int breadth) {
        area = 0.5 * length * breadth;
        System.out.printf("The area of the triangle is %.2f%n", area);
    }

 
    public void AreaRectangle(int length, int breadth) {
        area = length * breadth;
        System.out.printf("The area of the rectangle is %.2f%n", area);
    }


    public void FibonacciSeries(int num) {
        int fn = 0;
        int sn = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fn + " ");
            int temp=fn;
            fn = sn;
            sn = temp + sn;
        }
        System.out.println();
    }
    
    public void Factors(int num)
    {
    	for(int i=1;i<=num;i++)
    	{
    		
    		if(num%i==0)
    		{
    			System.out.print(" "+i);
    		}
    		
    	}
    	
    	
    }
    public void Sumof()
    {
    	Scanner sc=new Scanner(System.in);
    	int num;
    	int sum=0;
    	while(true)
    	{
    		
    		System.out.println("Enter the number");
            
    		num=sc.nextInt();
        
        
    		if(num==0)
    		{
        break;
    		}
        
    		sum=sum+num;
    		}
    	 
    	System.out.println("The sum of all numbers is: " + sum);
    	sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a1 = new Area();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Factors of a num");   
            System.out.println("6. Sum of  number until encounter zero");   
             System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                	System.out.println("Enter the radius of the circle:"); 
                    int radius = sc.nextInt();
                    a1.AreaCircle(radius);
                    break;
                case 2:
                    System.out.println("Enter the length and breadth of the triangle:");
                    int tLength = sc.nextInt();
                    int tBreadth = sc.nextInt();
                    a1.AreaTriangle(tLength, tBreadth);
                    break;
                case 3:
                    System.out.println("Enter the length and breadth of the rectangle:");
                    int rLength = sc.nextInt();
                    int rBreadth = sc.nextInt();
                    a1.AreaRectangle(rLength, rBreadth);
                    break;
                case 4:
                    System.out.println("Enter the number of terms for the Fibonacci series:");
                    int num = sc.nextInt();
                    a1.FibonacciSeries(num);
                    break;
                case 5:
                    System.out.println("Enter the number to find the factors :");
                    int num1 = sc.nextInt();
                    a1.Factors(num1);
                    break;
                case 6:
                    System.out.println("For Sum untill encounter 0");
                    a1.Sumof();
                    return;
                case 7:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }
}
