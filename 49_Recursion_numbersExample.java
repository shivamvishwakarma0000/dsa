// write a function to print hello word by using recursion 
public class recursion{
    public static void main(String[] args) {
        numbers(1);

    }
    static void numbers(int num){
        if(num==5){
            System.out.println("5");
            return;
        }
        System.out.println(num);
        numbers(num+1);
    }
//
//    static void numbers1(int num){
//        System.out.println(num);
//        numbers2(3);
//    }
//
//    static void numbers2(int num){
//        System.out.println(num);
//        numbers3(4);
//    }
//
//    static void numbers3(int num){
//        System.out.println(num);
//        numbers4(5);
//    }
//
//    static void numbers4(int num){
//        System.out.println(num);
//    }
}


// we use reursion to solve complex problem in easier way
// space complexity is not stable
//we can canverst recursion in iteration and wise versa
