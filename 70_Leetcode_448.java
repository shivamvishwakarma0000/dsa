//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

//Example 1:

//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//Example 2:

//Input: nums = [1,1]
//Output: [2]

//Constraints:
//
//n == nums.length
//1 <= n <= 105
//        1 <= nums[i] <= n



//import java.util.*;
//public class missing{
//    public static void main(String[] args) {
//        int []arr={4,3,2,7,8,2,3,1};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//
//        }
//        System.out.print(arr[0]);
//        System.out.print(arr[arr.length-1]);
//    }
//}



//public class MissingNumbersNoBoolean {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 3, 4, 7, 8};
//
//        int first = arr[0];
//        int last = arr[arr.length - 1];
//
//        System.out.print("Missing numbers: ");
//        for (int i = first; i <= last; i++) {
//            int j = 0;
//            for (; j < arr.length; j++) {
//                if (arr[j] == i) {
//                    break; // number found
//                }
//            }
//            if ( j == arr.length) {
//                // number not found in array
//                System.out.print([i] );
//            }
//        }
//    }
//}


import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: Mark visited indices as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Step 2: Check which indices are still positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // i+1 is missing
            }
        }

        return result;
    }
}

