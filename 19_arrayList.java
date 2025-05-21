import java.util.*;
public class arrayslist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(23);
//        list.add(21);
//        list.add(22);
//        list.add(25);
//        list.add(26);
//
//
//        System.out.println(list);
//        list.set(0,20);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//
        System.out.print("enter n numbers you want = :");
        int n = sc.nextInt();
        System.out.println("enter " + n + " " + "numbers value only ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(1));

        }
    }
}