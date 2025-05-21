//import java.util.Scanner;
//public class array{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter how many arrays length you want = ");
//        int n = sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("please enter " + n +  "digit number of arrays ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//    }
//}
import java.util.Arrays;
import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of string = ");
        int n = sc.nextInt();
        String[] str= new String(n);
        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();

        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//
//        }
        System.out.println(Arrays.toString(str));
    }
}
