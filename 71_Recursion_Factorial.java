//import java.util.*;
//public class factorial{
//    public static void main(String[] args) {
//int n=5;
//    int m=    factorail(n);
//        System.out.println(m);
//    }
//    public static int factorail (int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n*factorail(n-1);
//        }
//    }
//}


import java.util.*;
public class factorial{
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for (int i = 1; i <n ; i++) {
        fact=fact*i;

        }
        System.out.println(fact);
    }
}