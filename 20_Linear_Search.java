import java.util.*;
public class search{
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int n=6;
        int ans=linear(arr,n);
        System.out.println(ans);
    }

        static int linear(int[] arr,int n){
        // for (int i:arr) // enhance for loop
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==n){
                    return i;
                }

            }
            return -1;
        }



}