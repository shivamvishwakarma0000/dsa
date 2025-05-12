// scope mean if we have same code in braces it doesnot goes outside
// if i assign any value outside the scope
//it can access in scope but cant initialize
//if any value initialize in scope it cant access outside but can initialize outside
public  class scope{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int d=2222;

    {
        a=111;
        System.out.println(a);




    }
        {

            int c=30;
            System.out.println(c);
            System.out.println(a);
        }
}
}