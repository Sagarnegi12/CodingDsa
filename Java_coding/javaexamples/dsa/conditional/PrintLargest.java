package javaexamples.dsa.conditional;
import java.util.*;

public class PrintLargest {

    // Method to calculate factorial
    public void Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial is " + fact);
    }

    // Method to check if a character is a consonant or vowel
    public void consonent(char ch) {
        ch = Character.toLowerCase(ch);  // Convert to lowercase

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            // If it's a letter but not a vowel, it's a consonant
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }

    public static void main(String[] args) {

        // Create object of the class
        PrintLargest pl = new PrintLargest();
        Scanner sc = new Scanner(System.in);

        // Take character input to check vowel/consonant
        System.out.println("Enter a character to check (vowel/consonant):");
        char ch = sc.next().charAt(0);
        pl.consonent(ch);

        // Factorial of 10
        pl.Factorial(10);

        // Take integer inputs till the user enters 0 and print the largest number
        System.out.println("Enter numbers to find the largest (enter 0 to stop):");
        int num;
        int max = Integer.MIN_VALUE;  // Initialize max to minimum possible value

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;  // Stop when user enters 0
            }
            if (num > max) {
                max = num;  // Update max if the current number is greater
            }
        }

        // Print the largest number entered
        System.out.println("The largest number entered is: " + max);
        sc.close();
    }
}
