/*
Approach:
Use recursion to print numbers from 1 to n linearly. 
Start from the initial value i = 1 and print it. 
Then call the function recursively with i + 1 until i exceeds n. 
This demonstrates basic recursion where the function calls itself with updated parameters.

Time Complexity: O(n) - each number from 1 to n is printed once
Space Complexity: O(n) - recursion stack will hold n calls at most
*/

public class PrintLinearly {
    public static void printLinearly(int i , int n) {
        if(i > n) {
            return;
        }
        System.out.println(i + " ");
        i++;
        printLinearly(i , n);
    }

    public static void main(String[] args) {
        printLinearly(1 ,10);
    }
}
