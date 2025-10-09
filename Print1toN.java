/*
Approach:
This program prints numbers from 1 to n using recursion without using an incrementing loop variable. 
The function first makes a recursive call with (i - 1), which goes down to the base case when i < 1. 
As the recursive calls start returning, the numbers are printed in increasing order from 1 to n. 
This approach demonstrates how recursion can handle tasks that typically require iteration.

Time Complexity: O(n) - the function is called once for each number from n to 1
Space Complexity: O(n) - recursion stack depth equals n
*/

import java.util.Scanner;

public class PrintWithInc {
    public static void printWithoutInc(int i) {
        if (i < 1) {
            return;
        }
        printWithoutInc(i - 1);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printWithoutInc(n);
    }
}
