import java.util.Scanner;
public class swapp{
    public static void main(String[] args) {
        swap(1, 2);

    }
    static void swap(int a,int b){
       a=a+b;
        b=a-b;
       a=a-b;
        System.out.println("a = "+a+  " , b = "+b);




    }
}