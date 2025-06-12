//import java.util.*;
//public class PrintingPattern{
//    public static void main(String[] args) {
//        pattern1(4);
//    }
//    static void pattern1(int num){
//        for (int row = 0; row <num ; row++) {
//            for (int col = 0; col <num ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
//
//}



//import java.util.*;
//public class PrintingPattern{
//    public static void main(String[] args) {
//        pattern1(5);
//    }
//    static void pattern1(int num){
//        for (int row = 1; row <=num ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print(col +" ");
//            }
//            System.out.println();
//
//        }
//    }
//
//}



//import java.util.*;
//public class PrintingPattern{
//    public static void main(String[] args) {
//        pattern1(5);
//    }
//    static void pattern1(int num){
//        for (int row = 1; row <=num ; row++) {
//            for (int col = row; col >=1 ; col--) {
//                System.out.print(col +" ");
//            }
//            System.out.println();
//
//        }
//    }
//
//}






import java.util.*;
public class PrintingPattern{
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int num){
        for (int row = 1; row <=num ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col +" ");
            }
            System.out.println();

        }
    }

}