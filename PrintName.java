/*
This program prints a given name multiple times using recursion. 
A static counter variable is used to keep track of how many times the name has been printed. 
The recursive call continues until the counter exceeds 5, at which point the recursion stops.
This demonstrates the concept of recursion with a simple base condition and repeated function calls.

Time Complexity: O(n) - function is called 6 times (from 0 to 5)
Space Complexity: O(n) - recursion stack depth equals the number of calls
*/

import java.util.Scanner;

public class PrintName {
    static int count = 0;

    public static void printName(String name) {
        if (count > 5) {
            return;
        }

        System.out.println(name);
        count++;
        printName(name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        printName(n);
    }
}
