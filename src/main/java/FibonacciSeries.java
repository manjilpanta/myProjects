/*
Write a simple Java program which will print Fibonacci series e.g. 1 1 2 3 5 8 13 ... . up to
a given number. We prepare for cross questions like using iteration over recursion and how to optimize
the solution using caching and memoization.
*/
import java.util.Scanner;
public class FibonacciSeries {

    public static int fibonacci(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want in Fibonacci Series:");
        int count = new Scanner(System.in).nextInt();

        System.out.println(fibonacci(count));

    }
}
