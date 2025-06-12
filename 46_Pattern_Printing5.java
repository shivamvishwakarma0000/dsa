import java.util.*;
public class PrintingPattern{
    public static void main(String[] args) {
        pattern1(6);
    }
    static void pattern1(int num){
        for (int row = 1; row <num ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* " );

            }

            System.out.println();

        }
//        System.out.println();
        for (int row = 1; row <num ; row++) {
            for (int col = 1; col <=num-row-1 ; col++) {
                System.out.print("* " );

            }

            System.out.println();

        }
    }


}