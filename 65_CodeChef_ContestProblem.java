import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int remainder = N % 3;

        if (remainder == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}



