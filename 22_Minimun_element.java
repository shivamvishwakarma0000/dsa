

import java.util.*;
public class search{
    public static void main(String[] args) {
        int[] arr= {3,4,1,5,6};
        int ans=min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int minn=arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]<minn){

                minn=arr[i];
            }

        }
        return minn;
    }



}