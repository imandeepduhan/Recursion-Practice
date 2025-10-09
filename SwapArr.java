/*
This program reverses an array using recursion. 
It starts with two pointers — one from the beginning (i) and the other from the end (n - i - 1). 
In each recursive call, the elements at these two positions are swapped. 
The recursion continues until the index i reaches the midpoint of the array (i >= n/2). 
This eliminates the need for any iterative loop and demonstrates how recursion can be used to perform in-place operations.

Time Complexity: O(n) - each element is swapped once
Space Complexity: O(n) - recursion stack depth equals n/2 ≈ O(n)
*/

import java.util.Scanner;

public class SwapArr {
    public static void swapArr(int i, int arr[], int n) {
        if (i >= n / 2) return;

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        swapArr(i + 1, arr, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) arr[i] = input.nextInt();

        swapArr(0, arr, n);

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
