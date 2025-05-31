//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakMountain{
    public static void main(String[] args) {
         int[] arr={0,1,5,0};
         int ans=Peak(arr);
        System.out.println(ans);
    }
    static int Peak(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }


        }
        return max;


    }
}
