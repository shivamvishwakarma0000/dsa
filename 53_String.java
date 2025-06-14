//import java.util.*;
//public class string{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter two digit number =");
//
//        int n= sc.nextInt();
//        System.out.println("original number is = "+ n);
//        int A= n%10;
//        System.out.println("Second digit number is = "+A);
//        int B= 9;
//        System.out.println(" highest number is = " + (B*10+A));
//        int C= 0;
//        System.out.println("Lowest number is ="+(C*10+A) );
//        int D=( (B*10+A)-(C*10+A));
//        System.out.println("highest number is ="+D);
//
//
//
//
//    }
//}

import java.util.*;
public class maxDiff{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
       maxdiff(n);
      int B=  mindiff(n);
        System.out.println(A-B);
    }
    public static void maxdiff(int n){
        String str=Integer.toString(n);
        StringBuilder result= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == '1') {
                result.append('9');
            }else{
                    result.append(str.charAt(i));

                }


            }
        System.out.println(result);

        }
    public static void mindiff(int n){
        String str=Integer.toString(n);
        StringBuilder result= new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == '1') {
                result.append('0');
            }else{
                result.append(str.charAt(i));

            }


        }
        System.out.println(result);

    }




    }
