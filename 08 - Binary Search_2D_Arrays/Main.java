import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] ar = {
            {10, 20, 30, 40},
            {15, 24, 35, 45},
            {19, 29, 37, 50},
            {25, 34, 47, 55}
        };
        int[] ans = binarySearch(ar, 37);
        System.out.print(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] nums, int target){
        int row = 0;
        int col = nums.length - 1;
        while(row < nums.length - 1 && col >= 0){
            if(nums[row][col] > target){
                col--;
            }
            else if(nums[row][col] < target){
                row++;
            }
            else{
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}

/*
🧠 Linear search in a 2D array takes a maximum of O(n^2) comparisons in the worst case, where n is the number of rows or columns.
🔄 In a row-wise and column-wise sorted matrix, you can reduce the search space efficiently by comparing and eliminating rows or columns based on the target element.
⏰ Searching in a sorted matrix using binary search has a time complexity of O(2n), where n is the number of rows or columns.
🐛 Debugging code and using debug pointers helps understand and verify the functionality of the implemented algorithm.
🎯 In a strictly sorted matrix, applying binary search by comparing middle elements can efficiently locate the target element.
🎯 Binary search in 2D arrays involves reducing the search space by performing binary search on either middle columns or rows.
📉 Three cases in binary search: If the element is equal to the target, you found the answer. If it's greater, ignore that column; if it's less, ignore rows above, reducing the search space.
🕵️ When only two rows are remaining, check if the target is in the middle column. If not, divide the search into four parts and perform binary search in each part.
⏰ Time complexity: O(log n + log m), where n is the number of rows and m is the number of columns. Space complexity is constant.
🖥️ The code implementation involves handling edge cases, binary search in individual rows, and performing the main search on middle columns to find the target in a sorted 2D matrix.
🔄 Binary search is applied in different rows by adjusting the start and end columns based on target and matrix values.
📊 The presented code is demonstrated by searching for specific targets in a sorted 2D array.
🤔 Advanced questions, like finding the kth smallest in a sorted matrix, will be covered in future videos, introducing new concepts like heaps and hash maps.
📚 Assignments are provided in the video description for practice. Future topics include sliding window, two-pointer method, hash maps, and priority queues.
🚀 The course promises to make you interview-ready, covering a wide range of topics with a focus on theory and practical problem-solving.
*/