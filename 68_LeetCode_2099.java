//https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/

import java.util.*;
public class sum{
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//
//        int k= sc.nextInt();
//        int []arr={-1,-2,3,4};
        Arrays.sort(arr);
        int[] result = new int[k];
        int index = 0;

        for (int i = arr.length - k; i < arr.length; i++) {
            result[index++] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }
}