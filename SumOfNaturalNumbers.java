    /*
      Program to find the sum of first N natural numbers using recursion.
      
      Example:
      Input: 5
      Output: 15  (because 1 + 2 + 3 + 4 + 5 = 15)
      
      Explanation:
      sumOfNumbers(n) = n + sumOfNumbers(n - 1)
      Base case: if n == 0 → return 0
     */
import java.util.Scanner;
public class Sum {
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNumbers(n));
    }
}
