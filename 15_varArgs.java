// var args basically help to late more than one value in  a arrays format
//in varargs you can late multiple value not need to assign a , b , c and stuffs
import java.util.Arrays;
public class vararg{
    public static void main(String[] args) {
        fun(1,2,3,4,5);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}