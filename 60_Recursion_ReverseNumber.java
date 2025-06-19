public class rev{
  static  int sum=0;
    static void func(int n) {

        if (n == 0) {
            return ;

        }

        int rem= n%10;
        sum=sum*10+rem;
        func(n/10);



    }
    public static void main(String[] args) {
      func(12345);

        System.out.println(sum);



    }
}

