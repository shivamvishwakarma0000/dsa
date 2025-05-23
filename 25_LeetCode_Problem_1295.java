//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//i am modifiying this question little bit not whole question
//so this is modified leetcode problem , no. 1295
import java.util.*;
public class Leetcode{
    public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     int count=0;

        System.out.print("enter 5 digit only  ,and 1 , 2 and 3 digit number = ");
        int[] arr= new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();

        }

        for (int i = 0; i <arr.length ; i++) {
            int digits = String.valueOf(arr[i]).length();
            if(digits%2==0){
                count++;
            }


        }
        System.out.println(count);

    }
}