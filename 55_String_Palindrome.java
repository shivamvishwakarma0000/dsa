//import java.util.*;
//public class palindrome{
//    public static void main(String[] args) {
//  String str =" abcba";
//        System.out.println(isPalindrome(str));
//    }
//
//public static boolean isPalindrome(String str){
//        str=str.toLowerCase();
//    for (int i = 0; i < str.length() /2 ; i++) {
//        char start= str.charAt(i);
//        char end= str.charAt(str.length()-1-i);
//        if ( start!=end) {
//            return false;
//
//        }
//
//
//    }
//    return true;
//}
//}


import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        str= str.toLowerCase();
        char start = str.charAt(0);
        char end= str.charAt(str.length()-1);
        while(start<end){
            if(start!=end) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}