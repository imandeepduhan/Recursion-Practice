/*
Approach:
This program calculates the nth Fibonacci number using recursion. 
If n is 0 or 1, it returns n as the base case. 
Otherwise, it recursively calls fib(n-1) and fib(n-2) and returns their sum. 
This demonstrates basic recursion where each function call depends on the results of two smaller subproblems.

Time Complexity: O(2^n) - exponential due to overlapping subproblems
Space Complexity: O(n) - recursion stack can go up to n calls deep
*/

public class FibonSeries {
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n -2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
