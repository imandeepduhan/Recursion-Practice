/*
This program calculates the factorial of a given number using recursion. 
If n equals 1, it returns 1 as the base case. 
Otherwise, it recursively calls factorial(n-1) and multiplies it by n, 
reducing the problem size by 1 at each step until reaching the base case.

Time Complexity: O(n) - function is called once for each number from n to 1
Space Complexity: O(n) - due to the recursion stack depth
*/

import java.util.Scanner;

public class fac {
    public static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }
}
