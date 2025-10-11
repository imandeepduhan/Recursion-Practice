/*
This program prints all subsequences (or subsets) of a given array using recursion.
At each recursive step, the function decides whether to include or exclude the current element.
When the index reaches the end of the array, the current list represents one possible subsequence, which is then printed.
This approach effectively generates all 2^n possible subsequences of the array.

Time Complexity: O(2^n) - for each element, two recursive choices are made (include or exclude)
Space Complexity: O(n) - recursion stack depth proportional to the array size
*/

import java.util.*;

public class SubSequence {
    public static void subSequence(int ind, int arr[], List<Integer> list) {
        if (ind >= arr.length) {
            System.out.println(list);
            return;
        }

        list.add(arr[ind]);
        subSequence(ind + 1, arr, list);

        list.remove(list.size() - 1);
        subSequence(ind + 1, arr, list);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        subSequence(0, nums, list);
    }
}
