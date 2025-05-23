//import java.util.*;
//public class search{
//    public static void main(String[] args) {
//        int[] arr= {1,2,3,4,5,6};
//        int n=5;
//        int a=2;
//        int b=5;
//        int ans=linear(arr,n ,a,b);
//        System.out.println(ans);
//    }
//
//    static int linear(int[] arr,int n, int a, int b){
//        // for (int i:arr) // enhance for loop
//        for (int i = a; i <b; i++) {
//            if(arr[i]==n){
//                return i;
//            }
//
//        }
//        return -1;
//    }
//
//
//
//}


import java.util.*;
public class search{
    public static void main(String[] args) {
        int[] arr= {3,4,1,5,6};
        int ans=min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int minn=arr[0]

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==n){
                return i;
            }

        }
        return -1;
    }

}


//public class searchh{
//    public static void main(String[] args) {
//        int[] arr = {1, 12, 23, 14, 65, 6,};
//        int target = 14;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                System.out.println("Element is present at index " + i);
//            }
//        }
//    }
//}