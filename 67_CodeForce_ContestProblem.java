import java.util.*;

public class RaceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     // number of test cases


            int a = 3;
            int x = 1;
            int y = 5;
            boolean found = false;

            for (int b = 1; b <= 100; b++) {
                if (b == a) continue;
                if (Math.abs(b - x) < Math.abs(a - x) && Math.abs(b - y) < Math.abs(a - y)) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }



}







//import java.util.Scanner;
//import java.lang.Math;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in) ;
//
//
//            int a = 3;
//            int x = 1;
//            int y = 5;
//
//
//            int resAlice = a - x;
//            int resAlice1 = a - y;
//            int resBob1 = x - x;
//
//            int resBob3 = y - y;
//            boolean res=false;
//        for (int i = 1; i <=100 ; i++) {
//            if(i==a){
//                continue;
//
//            }
//            int resBob2 = i - y;
//            if(Math.abs(resAlice1)>Math.abs(resBob2)){
////                System.out.println("YES");
//                res =true;
//
//            }
//
//        }
//        for (int i = 1; i <=100 ; i++) {
//            if(i==a){
//                continue;
//
//            }
//            int resBob2 = i - x;
//            if(Math.abs(resAlice)>Math.abs(resBob2)){
////                System.out.println("YES");
//                res =true;
//
//            }
//
//        }
//        if(res){
//            System.out.println("YES");
//
//        }
//        else{
//
//                System.out.println("NO");
//            }
//
//        }
//
//
//}
//
//
